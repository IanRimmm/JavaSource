package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";

		Connection con = null; // java-DB ���ᰴü
		Statement stmt = null; // ���۰�ü(sql��)

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			stmt = con.createStatement();

			String sql = "INSERT INTO address(name,handphone,address)";
			sql = sql + "VALUES('������7','777-777-7777','�ѱ�')";

			int ret = stmt.executeUpdate(sql);
			System.out.println("���ڵ� " + ret + "���� �߰��Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
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
