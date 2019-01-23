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
			
			sum += intArray[i]; // 배열에 저장된 정수 값을 더하기

		}
		
		System.out.println("배열 원소의 평균은 " + sum/intArray.length + "입니다.");
	}
	
}