package day11;

public class ConstructorEX {
	
	public static void main(String[] args) {
		
		C c;
		c = new C();	// ������ ȣ��1
	}
}

class A{
	public A() {		// ������ ȣ��3
		super(); //����Ǿ� �ִ�!
		System.out.println("������ A");	// ������ ����4
	}
}

class B extends A{
	public B() {		// ������ ȣ��2
		System.out.println("������ B");	// ������ ����5
	}
}

class C extends B{
	public C() {
		System.out.println("������ C");	// ������ ����6
	}
}
// 1-2-3-4-5-6 ��!