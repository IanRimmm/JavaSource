package conding.day12;

public class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		
		int i = 10;
		Integer intObject = i; // auto boxing : �⺻�� -> ������ (�ڵ� ����ȯ)
		// 10�� ���� ���� �ؽ��ڵ尩�� ���� �� ��!
		System.out.println("IntObject = "+intObject);
		
		i = intObject + 10; // auto unboxing : ������ -> �⺻��
		System.out.println("i = " + i);
	}
}
