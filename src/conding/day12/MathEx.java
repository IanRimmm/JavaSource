package conding.day12;

public class MathEx {

	public static void main(String[] args) {
		double a = -2.7897434;
		System.out.println(Math.abs(a));// ���밪 ���ϱ�
		System.out.println(Math.ceil(a));// ceil �ø�
		System.out.println(Math.floor(a));// floor ����
		System.out.println(Math.sqrt(9.0));// ������
		System.out.println(Math.exp(1.5));// exp�Լ��� �ڿ��α��� ���� e(2.7~)�� x������ ���Ѵ�
		System.out.println(Math.rint(3.141592)); // rintrint: �μ��� ���� ����� ������ ��ȯ result = Math.rint(-34.3) -> -34.0��ȯ
		// System.out.println(Math.round(3.5));

		System.out.println("�̹� �� ����� ��ȣ��");
		for (int i = 0; i < 5; i++) {
			System.out.println(Math.round(1 + Math.random() * 10) + "");// ���� �߻�
		}
		System.out.println("�Դϴ�.");
	}
}
