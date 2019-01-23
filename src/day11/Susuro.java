package day11;

public class Susuro {
	
	public static void main(String[] args) {
		B01 b = new B01(10);
		b.a = 20;
		b.b = 30;
		B01 b2 = new B01();
		
	}
}

class A01{
	int a;
	
	public A01() {
		super();
		System.out.println("A01 호출 테스트");	//1-1	//2-1
		System.out.println("A01 값 대입" + a);	//1-2	//2-2
	}
}

class B01 extends A01{
	int b;
	
	public B01() {
		super();									//2
		System.out.println("B01 호출 테스트");			//2-3
		System.out.println("B01 값 대입" + b); 			//2-4
	}
	public B01(int b) {
		super();							//1
		this.b = b;
		System.out.println("B01 값 대입" + b);	//1-3
		System.out.println("------------"); //1-4
	}
}