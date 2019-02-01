package conding.day13;

import java.util.Scanner;

public class ExceptionExample2 {
	
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;	//제수 : 어떤 수를 나누는 수
		int dividend = 0;	//피제수 dividend
		
		System.out.print("나눔수를 입력하시오.");
		dividend = rd.nextInt();
		System.out.print("나눗수를 입력하시오.");
		divisor = rd.nextInt();
		
		try {
			System.out.println(dividend+"를"+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
		}catch(ArithmeticException e) {	//ArithmeticException 예외 처리 블록
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
