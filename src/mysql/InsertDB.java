package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";

		Connection con = null; // java-DB 연결객체
		Statement stmt = null; // 전송객체(sql문)

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			stmt = con.createStatement();

			String sql = "INSERT INTO address(name,handphone,address)";
			sql = sql + "VALUES('개발자7','777-777-7777','한국')";

			int ret = stmt.executeUpdate(sql);
			System.out.println("레코드 " + ret + "개가 추가되었습니다.");
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
