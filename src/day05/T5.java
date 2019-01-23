package day05;

public class T5 {
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int max = 0;
		int min = 0;

		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		System.out.println("최대값 : " + max + "최소값 : " + min);

	}
}
