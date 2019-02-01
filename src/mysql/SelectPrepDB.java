package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectPrepDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (java.lang.ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
			System.out.println(e.getMessage());
		}

		try {
			// Ŀ�ؼ� ����
			con = DriverManager.getConnection(url, "javauser", "1234");
			String sql = " select addressnum, name, handphone, address from address where addressnum = ? ";
			// ��������
			pstmt = con.prepareStatement(sql);
			// (����ǥ�� ����, ������ ��)
			// ���ڿ� ���� pstmt.setString(...)
			// ù��° ?ǥ�� �� 6�� ����
			pstmt.setInt(1, 8);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("��ȣ : " + rs.getInt("addressnum"));
				System.out.println("���� : " + rs.getString("name"));
				System.out.println("��ȭ��ȣ : " + rs.getString("handphone"));
				System.out.println("�ּ� : " + rs.getString("address"));
				System.out.println("-------------------------------");
			}
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
			}
		}
	}
}
