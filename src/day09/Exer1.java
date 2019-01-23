package day09;

public class Exer1 {

	public static void main(String[] args) {
		Sub ob = new Sub(); // 자식클래스에 접근!
		ob.wirte();

		ob.print1();

		ob.print2();
		System.out.println("--------------");
		System.out.println("ob.b:" + ob.b);
		System.out.println("((Super)ob).b: " + ((Super) ob).b);
		((Super) ob).wirte();	// (괄호)안에 부모클래스name을 넣어주면, 접근가능하다!
	}
}

class Super {
	protected int a = 10, b = 20;

	public void wirte() {
		System.out.println("부모클래스의 write()메소드");
		System.out.println("a:" + a + ",b:" + b);
	}
}

class Sub extends Super {
	protected int b = 30, c = 40;

	public void wirte() {	//메소드 오버라이딩(재정의)! Super(부모)클래스에 write()메소드가 있는데, 오버라이딩 해서 재정의하여 사용 가능키 때문에 전혀 문제가 되지 않는다.
		System.out.println("자식클래스의 write()메소드");
		System.out.println("a:" + a + ",b:" + b + ",c:" + c);
	}

	public void print1() {
		System.out.println("서브 클래스의 print1()메소드");
		wirte();
	}

	public void print2() {
		System.out.println("서브 클래스의 print2()메소드");
		super.wirte();
	}
}