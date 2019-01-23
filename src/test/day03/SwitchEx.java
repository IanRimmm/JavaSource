package test.day03;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하시오.");
		int score= scan.nextInt();
		
		int grade = score/10;
		switch (grade) {
		case 10:
			System.out.println("100점입니다.");
			break;
		case 9:
			System.out.println("등급은 A입니다.");
			break;
		case 8:
			System.out.println("등급은 B입니다.");
			break;
			
		case 7:
			System.out.println("등급은 C입니다.");
			break;
			
		case 6:
			System.out.println("등급은 D입니다.");
			break;
			
		default:
			System.out.println("노력하세요.");
			break;
		}
	}

}
