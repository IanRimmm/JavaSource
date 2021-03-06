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
			// 커넥션 연결
			con = DriverManager.getConnection(url, "javauser", "1234");
			String sql = " select addressnum, name, handphone, address from address where addressnum = ? ";
			// 쿼리지정
			pstmt = con.prepareStatement(sql);
			// (물음표의 순번, 적용할 값)
			// 문자열 지정 pstmt.setString(...)
			// 첫번째 ?표에 값 6을 지정
			pstmt.setInt(1, 8);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("번호 : " + rs.getInt("addressnum"));
				System.out.println("성명 : " + rs.getString("name"));
				System.out.println("전화번호 : " + rs.getString("handphone"));
				System.out.println("주소 : " + rs.getString("address"));
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
