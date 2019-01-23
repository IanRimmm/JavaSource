package day04;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int[] intArray = new int[5];
		/*
		배열을 사용하는 이유?
		- 배열을 이용하면 한 번에 많은 메모리 공간 선언 가능
		- 배열은 같은 type의 데이터들이 순차적으로 저장되어 있어, 반복문을 이용하여 처리하기에 적합한 구조
		 */
		
//		int max=0;		why? 음수가 들어가면 가장 큰 수는 초기입력값인 0이 되므로
//		int min = 100;
		int max = Integer.MIN_VALUE; //어떤 숫자가 들어오더라도 INT의 중에서 가장 작은 최소값을 가르킴.

		for (int i = 0; i < 5; i++) {
			intArray[i] = in.nextInt();
			 if(intArray[i]>max)
				 max=intArray[i];
//				if (intArray[i] < min)
//					min = intArray[i];
		}
//		System.out.println("입력된 수에서 가장 큰 수는 " + min + "입니다.");
		System.out.println("입력된 수에서 가장 큰 수는 " + max + "입니다.");
	}

}
