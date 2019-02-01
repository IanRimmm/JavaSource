package conding.day12;

public class MathEx {

	public static void main(String[] args) {
		double a = -2.7897434;
		System.out.println(Math.abs(a));// 절대값 구하기
		System.out.println(Math.ceil(a));// ceil 올림
		System.out.println(Math.floor(a));// floor 내림
		System.out.println(Math.sqrt(9.0));// 제곱근
		System.out.println(Math.exp(1.5));// exp함수는 자연로그의 밑인 e(2.7~)의 x제곱을 구한다
		System.out.println(Math.rint(3.141592)); // rintrint: 인수와 가장 가까운 정수를 반환 result = Math.rint(-34.3) -> -34.0반환
		// System.out.println(Math.round(3.5));

		System.out.println("이번 주 행운의 번호는");
		for (int i = 0; i < 5; i++) {
			System.out.println(Math.round(1 + Math.random() * 10) + "");// 난수 발생
		}
		System.out.println("입니다.");
	}
}
