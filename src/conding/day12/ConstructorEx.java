package conding.day12;

public class ConstructorEx {
	public static void main(String[] args) {
		C c;
		c = new C();
	}
}

class A{
	public A() {
		System.out.println("생성자 A");
	}
}

class B extends A{
	public B() {
		System.out.println("생성자B");
	}
}

class C extends B{
	public C() {
		//super();이 생략되어 있다고 생각해라!
		System.out.println("생성자C");
	}
}