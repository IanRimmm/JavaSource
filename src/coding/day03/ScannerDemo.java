package coding.day03;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Hello World! 3+3.0=6";
		
		Scanner scanner = new Scanner(s);
		
//		Scanner scanner = new Scanner(System.in);
		
		System.out.println(""+scanner.hasNext());
		System.out.println(""+scanner.nextLine()); //nextline의 경우 " "안의 한 라인 전체를 인식!
		System.out.println(""+scanner.hasNext());  //netxint의 경우는 하나의 워딩을 인식!
		
		scanner.close();
	}

}
