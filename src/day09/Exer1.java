package day09;

public class Exer1 {

	public static void main(String[] args) {
		Sub ob = new Sub(); // �ڽ�Ŭ������ ����!
		ob.wirte();

		ob.print1();

		ob.print2();
		System.out.println("--------------");
		System.out.println("ob.b:" + ob.b);
		System.out.println("((Super)ob).b: " + ((Super) ob).b);
		((Super) ob).wirte();	// (��ȣ)�ȿ� �θ�Ŭ����name�� �־��ָ�, ���ٰ����ϴ�!
	}
}

class Super {
	protected int a = 10, b = 20;

	public void wirte() {
		System.out.println("�θ�Ŭ������ write()�޼ҵ�");
		System.out.println("a:" + a + ",b:" + b);
	}
}

class Sub extends Super {
	protected int b = 30, c = 40;

	public void wirte() {	//�޼ҵ� �������̵�(������)! Super(�θ�)Ŭ������ write()�޼ҵ尡 �ִµ�, �������̵� �ؼ� �������Ͽ� ��� ����Ű ������ ���� ������ ���� �ʴ´�.
		System.out.println("�ڽ�Ŭ������ write()�޼ҵ�");
		System.out.println("a:" + a + ",b:" + b + ",c:" + c);
	}

	public void print1() {
		System.out.println("���� Ŭ������ print1()�޼ҵ�");
		wirte();
	}

	public void print2() {
		System.out.println("���� Ŭ������ print2()�޼ҵ�");
		super.wirte();
	}
}