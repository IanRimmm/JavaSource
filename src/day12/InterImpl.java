package day12;

public class InterImpl implements Inter{
	
	@Override
	public int add(int i, int j) {
		return i+j;
	}
	@Override
	public int sub(int i, int j){
		return i-j;
	}
	
	public static void main(String[] args) {
		InterImpl interImpl = new InterImpl();	//subclass ��ü ����
		System.out.println(interImpl.add(10, 5));
		System.out.println(interImpl.sub(10, 5));
		
		//�������̽��� ����� �����Ǿ� ������������
		//��ü�� ������ �� �����ϴ�.
		//Inter inter = new Inter();
		
		//�������̽��� ���� Ŭ������ �Ҵ� ���� �� �ֽ��ϴ�.
		//�������̽� = ���� Ŭ����
		
		Inter inter2 = new InterImpl();	//upcasting
		System.out.println(inter2.add(100, 50));
		System.out.println(inter2.sub(100, 50));
		
	}
}

interface Inter{
	
	/*abstract*/ int add(int i, int j); //Interface�� �����, �߻�޼ҵ�� �̷�����Ƿ� abstract�� �� �ᵵ �ȴ�!
	
	int sub(int i, int j);
}