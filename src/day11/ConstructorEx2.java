package day11;

public class ConstructorEx2 {
	
	public static void main(String[] args) {
		
		B1 b;
		b = new B1();
		
	}
}

class A1{
	public A1() {
		System.out.println("������ A");	//�Ű������� ���� �⺻������ ȣ��
	}
	
	public A1(int x) {
		System.out.println("int x�� �� ������A" + x);
	}
}

class B1 extends A1{
	public B1() {	
//		super. ��ü����(�������, �޼ҵ�)
//		super(10) - �޼ҵ�, ��������
//		System.out.println("123");
		super(100);		//�Ű������� �ִ� ������ ȣ��
		System.out.println("������ B");
	}
}