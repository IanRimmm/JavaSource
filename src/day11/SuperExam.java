package day11;

public class SuperExam {
	
	public static void main(String[] args) {
		SubOverC over1 = new SubOverC(10, 20, 30);	//�ڽ� ��ü�� ���������ϱ�, �θ�� �ڽ� �� �� ��ü ����!
		
		//���� �ڽ� ��ü �� ����
		System.out.println("i,j,k�� �� : "+ over1.i+ " " + over1.j+ " " + over1.k);
		
//		�ڽ� Ŭ������ void show(); ȣ��
//		System.out.println("���� Ŭ������ �޼ҵ� show() ����");
//		System.out.println("==-super�� �̿��� ���� Ŭ���� �޼ҵ� ȣ��===");
//		super.show();
		over1.show();
	}
}

class OverC{
	int i,j;
	
	//������
	public OverC(int i, int j) {
		this.i = i; //10
		this.j = j; //20
	}
	
	void show() {
		System.out.println("����Ŭ������ �޼ҵ� show() ����");

	}
}

class SubOverC extends OverC{
	int k;
	
	//int i : �θ�Ŭ����
	//int j : �θ�Ŭ����
	//int k : �θ�Ŭ����
	
	public SubOverC(int i, int j,int k) {
		super(i, j); //���� Ŭ������ �����ڸ� ȣ��
		this.k = k;  //k�� 10���� �ʱ�ȭ�� �մϴ�.
	}
	
	void show() {
		System.out.println("���� Ŭ������ �޼ҵ� show() ����");
		System.out.println("==-super�� �̿��� ���� Ŭ���� �޼ҵ� ȣ��===");
		super.show();
	}
}