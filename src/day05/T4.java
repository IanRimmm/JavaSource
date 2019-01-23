package day05;

import java.util.Calendar;

public class T4 {
	public static void main(String[] args) {
		String name = args[0];
		String phone = args[1];
		String address = args[2];
		String year = args[3];
		int iage = Integer.parseInt(year.substring(0,1));
		
		iage += 1900;
		
		Calendar calendar = Calendar.getInstance();
		int currYear = calendar.get(Calendar.YEAR);
		
		System.out.println(name);
		System.out.println(phone);
		System.out.println(address);
		System.out.println(currYear-iage);
	}
}
