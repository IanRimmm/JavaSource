package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex3 {

	public static void main(String[] args) {
		
		Connection con = null;
		String url = "";
		String uesr = "";
		String password = "";
		
		try {
			con = DriverManager.getConnection(url, uesr, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
