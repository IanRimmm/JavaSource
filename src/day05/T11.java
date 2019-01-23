package day05;

import java.util.*;
import java.util.Scanner;

public class T11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�̸��� �Է����ּ��� : ");
		String name = in.nextLine();
		
		System.out.print("�ּҸ� �Է����ּ��� : ");
		String address = in.nextLine();
		
		System.out.print("������ �Է����ּ��� : ");
		String year = in.nextLine();
		
		int iage = Integer.parseInt(year.substring(0,2));
		iage += 1900;
		
		Calendar calendar = Calendar.getInstance();
		int currYear = calendar.get(Calendar.YEAR);
		int age = currYear - iage;
		
		System.out.println("�̸� : " + name);
		System.out.println("�ּ� : " + address);
		System.out.println("���� : " + age);
	}

}
