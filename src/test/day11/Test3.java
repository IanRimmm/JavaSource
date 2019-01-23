package test.day11;

class SuperTest {
	public int a = 10, b = 20;

	public void write() {
		System.out.println("슈퍼클래스 write() 메소드");
	}

	public int hap() {
		return a + b;
	}
}

class SubTest extends SuperTest {
	public int b = 100, c = 200;

	public void print() {
		System.out.println("서브클래스 print() 메소드");
	}

	@Override
	public int hap() {
		return a + b + c;
	}
}

public class Test3 {

	public static void main(String[] args) {
		SubTest ob1 = new SubTest();

		System.out.println("b: " + ob1.b);

		SuperTest ob2 = ob1; // 업캐스팅
		System.out.println("b: " + ob2.b);

		System.out.println("합: " + ob2.hap()); // 동적바인딩
		// 오버라이딩하여 재정의하면 자식클래스의 합, 안하면 부모클래스의 합 출력

		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());

		ob2.write();
		// ob2.print(); -> 부모가 자식클래스의 메소드에는 접근할 수 없음.

		SuperTest ob3 = (SubTest) ob2; // 다운캐스팅
		System.out.println(ob3.hashCode());
		System.out.println(ob3.hap()); // 오버라이딩 했으므로 자식클래스에 접근하여 출력
	}
}