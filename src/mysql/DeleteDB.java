package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";

		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			stmt = con.createStatement();

			String sql = "delete from address where addressnum=5";

			int ret = stmt.executeUpdate(sql);

			System.out.println("���ڵ� " + ret + "���� ���� �Ǿ����ϴ�.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException : " + e.getMessage());
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
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
