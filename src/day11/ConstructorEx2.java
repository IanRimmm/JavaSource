package day11;

public class ConstructorEx2 {
	
	public static void main(String[] args) {
		
		B1 b;
		b = new B1();
		
	}
}

class A1{
	public A1() {
		System.out.println("생성자 A");	//매개변수가 없는 기본생성자 호출
	}
	
	public A1(int x) {
		System.out.println("int x가 들어간 생성자A" + x);
	}
}

class B1 extends A1{
	public B1() {	
//		super. 객체접근(멤버변수, 메소드)
//		super(10) - 메소드, 인자전달
//		System.out.println("123");
		super(100);		//매개변수가 있는 생성자 호출
		System.out.println("생성자 B");
	}
}