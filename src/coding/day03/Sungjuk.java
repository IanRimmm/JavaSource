package coding.day03;

public class Sungjuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] jumsu = new int[4];
		int tot = 0;
		int avg = 0;
		String grade = "";

		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print("���������� �Է��ϼ���:");
		jumsu[0] = in.nextInt(); // ���� �Է�

		System.out.print("���������� �Է��ϼ���:");
		jumsu[1] = in.nextInt(); // ���� �Է�

		System.out.print("���������� �Է��ϼ���:");
		jumsu[2] = in.nextInt(); // ���� �Է�

		System.out.print("���������� �Է��ϼ���:");
		jumsu[3] = in.nextInt(); // ���� �Է�

		tot = jumsu[0] + jumsu[1] + jumsu[2] + jumsu[3];
		avg = tot / 4;

		if (avg >= 90 && avg <= 100) { // 90 <= avg <= 100
			grade = "A";
		} else if (avg >= 80 && avg <= 89) {
			grade = "B";
		} else if (avg >= 70 & avg <= 79) {
			grade = "C";
		} else if (avg >= 60 && avg <= 69) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("----------------------");
		System.out.println(" ���� ������ ");
		System.out.println("----------------------");

		System.out.println("����");

		int _kuk = jumsu[0] / 10;
		for (int i = 1; i <= _kuk; i++) {
			System.out.print("*");
		}

		System.out.println(" " + jumsu[0]);

		System.out.print("����:");

		int _eng = jumsu[1] / 10;
		for (int i = 1; i <= _eng; i++) {
			System.out.print("*");
		}
		System.out.println(" " + jumsu[1]);

		System.out.print("����:");

		int _mat = jumsu[2] / 10;
		for (int i = 1; i <= _mat; i++) {
			System.out.print("*");

		}
		System.out.println(" " + jumsu[2]);

		System.out.print("����:");

		int _com = jumsu[3] / 10;
		for (int i = 1; i <= _com; i++) {
			System.out.print("*");
		}
		System.out.println(" " + jumsu[3]);

		System.out.print("����: " + tot);
		System.out.print("  ���:" + avg);
		System.out.println("  ���:" + grade);
		System.out.println("-------------------------");
	}

}
