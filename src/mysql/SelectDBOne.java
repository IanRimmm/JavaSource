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
			//쿼리를 실행하여 레코드 집합을 rs 객체로 저장합니다.
			rs = stmt.executeQuery(sql);
			//레코드가 있으면 true를 리턴하고 첫번째 레코드로 이동
			if(rs.next()) {
				int addressnum = rs.getInt(1); // 첫번째 정수 컬럼
				String name = rs.getString(2); // 두번째 문자열 컬럼
				String handphone = rs.getString("handphone"); //컬럼명 명시
				String address = rs.getString("address");
				System.out.println("번호 : " + addressnum);
				System.out.println("성명 : " + name);
				System.out.println("전화번호 : " + handphone);
				System.out.println("주소 : " + address);
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
