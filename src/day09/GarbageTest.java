package day09;

public class GarbageTest {
	public static void main(String[] args) {
		//��ü ����
		Garbage[] ga = new Garbage[10];
		for(int i=0;i<ga.length;i++) {
			ga[i] = new Garbage(i);
		}
		
		//��ü �޸� ����
		for(int i=0;i<ga.length;i++) {
			ga[i] = null;	//�޸� ȸ���� ����� �ȴ�.
		}
		
		//������ GC ��� ����
		System.gc();
	}
}

class Garbage{
	int objNO;
	
	public Garbage(int n) {	//�����ڴ� ������� �ʱ�ȭ
		objNO = n;
		System.out.println("Garbage class" + objNO +"�� ����� �����ϴ�.");
		
	}
	
	protected void finalize() throws Throwable{
		System.out.println("Garbage class" + objNO + "���� ���̴� �޸𸮰� �����Ǿ����ϴ�.");
		super.finalize();
	}
}