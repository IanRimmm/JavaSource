package day10;

public class OverrideExam2 {
	public static void main(String args[]) {
		//�θ� Ŭ���� ��ü ����
		OverB ob = new OverB();
		ob.show();	//�θ�Ŭ������ �޼ҵ� show()
		ob.parent();
		
		//�ڽ� Ŭ���� ��ü ����
		//����� ���õǸ鼭 �ڽ� Ŭ������ �޼ҵ尡 ����˴ϴ�.
		SubOverB over = new SubOverB();
		over.show(); //�ڽ�Ŭ������ �޼ҵ� show()
		over.parent();
	}
}

class OverB{
	void show() {
		System.out.println("�θ�Ŭ������ �޼ҵ� show()");
	}
	
	void parent() {
		System.out.println("�θ�Ŭ�������� �ִ� �޼ҵ� parent()");
	}
}

class SubOverB extends OverB{
	//�������̵�
	void show() {
		System.out.println("�ڽ�Ŭ������ �޼ҵ� show()");
	}
}