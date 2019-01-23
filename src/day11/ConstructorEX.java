package day11;

public class ConstructorEX {
	
	public static void main(String[] args) {
		
		C c;
		c = new C();	// 생성자 호출1
	}
}

class A{
	public A() {		// 생성자 호출3
		super(); //내장되어 있다!
		System.out.println("생성자 A");	// 생성자 실행4
	}
}

class B extends A{
	public B() {		// 생성자 호출2
		System.out.println("생성자 B");	// 생성자 실행5
	}
}

class C extends B{
	public C() {
		System.out.println("생성자 C");	// 생성자 실행6
	}
}
// 1-2-3-4-5-6 순!