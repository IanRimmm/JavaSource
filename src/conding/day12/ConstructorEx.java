package conding.day12;

public class ConstructorEx {
	public static void main(String[] args) {
		C c;
		c = new C();
	}
}

class A{
	public A() {
		System.out.println("������ A");
	}
}

class B extends A{
	public B() {
		System.out.println("������B");
	}
}

class C extends B{
	public C() {
		//super();�� �����Ǿ� �ִٰ� �����ض�!
		System.out.println("������C");
	}
}