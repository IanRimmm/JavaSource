package day03;

public class IfTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 120;

		if (i % 2 == 0) {
			int count = 1;
			System.out.println(i + "은(는) 짝수");	
		}
		//System.out.println("count:"+ count);
		
		if (i % 2 == 0) {
			System.out.println("짝수 " + i);
		} else {
			System.out.println("홀수 " + i);
		}

		if (i % 3 == 0) {
			System.out.println("3의 배수");
		} else if (i % 4 == 0) {
			System.out.println("4의 배수");
		} else if (i % 7 == 0) {
			System.out.println("7의 배수");
		} else {

			System.out.println("3, 4, 7의 배수가 아닙니다.");
		}

		if (1 == 1)
			System.out.println("동일");
		if (2 == 2)
			System.out.println("동일");

		if (3 == 3) {

			System.out.println("동일");

		}
	}
}
