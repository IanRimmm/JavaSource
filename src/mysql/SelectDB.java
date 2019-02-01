package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import org.gjt.mm.mysql.Driver;	import는 단순히 불러와서 여기서 쓰겠다의 의미!

public class SelectDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb?" + "useUnicode=true&characterEncoding=utf8";

		Connection con = null;	// java-sql 전송객체
		Statement stmt = null;	// 전달객체
		ResultSet rs = null;	// dql, dml, ddl에서 dql의 결과값을 받을 객체생성!	// ResultSet은 select할때만 필요, update시에는 필요치 않다.

		try {
			Class.forName("org.gjt.mm.mysql.Driver");	//Class.forName();은 어떤 타입인지 모를 때, 객체 생성하는 것(메모리에 등록)!
		} catch (java.lang.ClassNotFoundException e) {
			e.printStackTrace();
			System.err.print("ClassNotFoundException");
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			stmt = con.createStatement();
			String sql = "select addressnum, name, handphone, address ";
			sql = sql + "from address order by name ASC";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int addressnum = rs.getInt(1);
				String name = rs.getString(2);
				String handphone = rs.getString("handphone");
				String address = rs.getString("address");

				System.out.println("번호 : " + addressnum);
				System.out.println("성명 : " + name);
				System.out.println("전화번호 : " + handphone);
				System.out.println("주소 : " + address);
				System.out.println("--------------------");
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
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
			}
		}
	}
}
