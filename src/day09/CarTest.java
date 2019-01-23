package day09;

public class CarTest {
	public static void main(String[] args) {
		ChildCar2 cc2 = new ChildCar2();	//ChildCar로 하면 gear2가 안잡힘
		cc2.gear();
		cc2.auto_gear();
		cc2.auto_gear2();
		
	}
}

class Car{
	public void gear() {
		System.out.println("수동 기어를 사용합니다.");
	}
}

class ChildCar extends Car{
	public void auto_gear() {
		System.out.println("자동 기어를 사용합니다.");
	}
}

class ChildCar2 extends ChildCar{
	public void auto_gear2() {
		System.out.println("수동/자동 기어를 혼합하여 사용합니다.");
	}
}