package coding.day03;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int intArray[] = new int[5];
		
		double sum = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = in.nextInt();
			
			sum += intArray[i]; // �迭�� ����� ���� ���� ���ϱ�

		}
		
		System.out.println("�迭 ������ ����� " + sum/intArray.length + "�Դϴ�.");
	}
	
}