package coding.day03;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			int n = Integer.parseInt(args[i]);  // Integer.parseint �� "100"(���ڿ�) -> 100(���ڿ�)�� �ٲ��ִ� '->'������ �Ѵ�.
			sum += n;							// argument�� �Ű����� �� parameter�̴�.

		}

		System.out.println("sum = " + sum);
	}

}
