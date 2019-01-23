package test.day03;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				continue;
			else
				sum = sum + i;

		}
		System.out.println("1~100까지의 짝수의 합은 " + sum);
	}

}
