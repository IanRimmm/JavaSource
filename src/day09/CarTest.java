package day09;

public class CarTest {
	public static void main(String[] args) {
		ChildCar2 cc2 = new ChildCar2();	//ChildCar�� �ϸ� gear2�� ������
		cc2.gear();
		cc2.auto_gear();
		cc2.auto_gear2();
		
	}
}

class Car{
	public void gear() {
		System.out.println("���� �� ����մϴ�.");
	}
}

class ChildCar extends Car{
	public void auto_gear() {
		System.out.println("�ڵ� �� ����մϴ�.");
	}
}

class ChildCar2 extends ChildCar{
	public void auto_gear2() {
		System.out.println("����/�ڵ� �� ȥ���Ͽ� ����մϴ�.");
	}
}