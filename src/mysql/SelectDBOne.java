package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDBOne {
	
	public static void main(String[] args) {
		String url =  "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8"; 
		
		Connection con = null;
		Statement stmt = null;
		
		ResultSet rs = null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException : ");
			System.err.println(e.getMessage());
		}
		
		try {
			con = DriverManager.getConnection(url,"javauser","1234");
			stmt = con.createStatement();
			String sql = "SELECT addressnum, name, handphone, address ";
			sql = sql + "FROM address where addressnum=8";
			//������ �����Ͽ� ���ڵ� ������ rs ��ü�� �����մϴ�.
			rs = stmt.executeQuery(sql);
			//���ڵ尡 ������ true�� �����ϰ� ù��° ���ڵ�� �̵�
			if(rs.next()) {
				int addressnum = rs.getInt(1); // ù��° ���� �÷�
				String name = rs.getString(2); // �ι�° ���ڿ� �÷�
				String handphone = rs.getString("handphone"); //�÷��� ���
				String address = rs.getString("address");
				System.out.println("��ȣ : " + addressnum);
				System.out.println("���� : " + name);
				System.out.println("��ȭ��ȣ : " + handphone);
				System.out.println("�ּ� : " + address);
			}
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		} finally {
			try {
				if(rs != null) { rs.close();}
			}catch(Exception e) {}
			try {
				if(con != null) { con.close();}
			}catch(Exception e) {}
		}
	}
}	
