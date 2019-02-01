package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserPrepDB {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.err.print("ClassNotFoundException : ");
			System.err.println(e.getMessage());
		}
		
		try {
			con = DriverManager.getConnection(url,"javauser","1234");
			String sql = " insert into address(name, handphone, address) values(?,?,?) ";
			
			//쿼리지정
			pstmt = con.prepareStatement(sql);
			//(물음표의 순번, 적용할 값)
			pstmt.setString(1, "개발자9");
			pstmt.setString(2, "999-9999-9999");
			pstmt.setString(3, "베트남");
			
			int ret = pstmt.executeUpdate();
			
			System.out.println("레코드 " + ret + " 개가 추가 되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLExcepiont : " + e.getMessage());
		}finally {
			try {
				if(pstmt != null) {pstmt.close();}
			}catch(Exception e) {}
			try {
				if(con != null) {con.close();}
			}catch(Exception e) {}
		}
	}
}
