package conding.day13;

public class SungjukTest {
	
	public static void main(String[] args) {
		// ERROR
		// ISungjuk iis = new ISungjuk();	//�������̽��� ��ü�� ���� �� �� ���� ������, ������� �ʴ´�.
		
		ISungjuk is = new Sungjuk();	//upcasting
		is.setJumsu(90, 85);
		is.print();
	}
}

interface ISungjuk{
	public void setJumsu(int kuk, int eng);
	public abstract void print();
}

class Sungjuk implements ISungjuk{
	int kuk = 0; //����
	int eng = 0; //����
	
	@Override
	public void setJumsu(int kuk, int eng) {
		this.kuk = kuk;
		this.eng = eng;
	}
	
	@Override
	public void print() {
		System.out.println("���� ����");
		System.out.println("���� : "+this.kuk);
		System.out.println("���� : "+this.eng);
	}
}