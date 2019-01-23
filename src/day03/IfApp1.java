package day03;

import java.util.Scanner;

public class IfApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =101;
		
		if((k%3 == 0) || (k%5==0)) {
			System.out.println("k의 값은 "+k+":3의 배수이거나 5의 배수임");
		}else
			System.out.println("K의 값은 3의 배수이거나 5의 배수가 아닙니다");
	}

}
