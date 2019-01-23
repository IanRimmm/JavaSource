package coding.day03;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			int n = Integer.parseInt(args[i]);  // Integer.parseint 가 "100"(문자열) -> 100(숫자열)로 바꿔주는 '->'역할을 한다.
			sum += n;							// argument가 매개변수 즉 parameter이다.

		}

		System.out.println("sum = " + sum);
	}

}
