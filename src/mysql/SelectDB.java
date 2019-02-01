package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import org.gjt.mm.mysql.Driver;	import�� �ܼ��� �ҷ��ͼ� ���⼭ ���ڴ��� �ǹ�!

public class SelectDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb?" + "useUnicode=true&characterEncoding=utf8";

		Connection con = null;	// java-sql ���۰�ü
		Statement stmt = null;	// ���ް�ü
		ResultSet rs = null;	// dql, dml, ddl���� dql�� ������� ���� ��ü����!	// ResultSet�� select�Ҷ��� �ʿ�, update�ÿ��� �ʿ�ġ �ʴ�.

		try {
			Class.forName("org.gjt.mm.mysql.Driver");	//Class.forName();�� � Ÿ������ �� ��, ��ü �����ϴ� ��(�޸𸮿� ���)!
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

				System.out.println("��ȣ : " + addressnum);
				System.out.println("���� : " + name);
				System.out.println("��ȭ��ȣ : " + handphone);
				System.out.println("�ּ� : " + address);
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
