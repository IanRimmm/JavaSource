package day02;

public class Cast_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1234;
		int k;
		float f =10.5f;
		double d =100.55;
		
		k=(int)f;
		System.out.println(k);
		
		f=i;					// ���ذ� �ȵ�! ���� ����!
		System.out.println(f);
		
		f=(float)d;				// float�� 4byte �Ǽ��ε� �׷� 100.5 ���� �ϴ� �� �ƴѰ�?
		System.out.println(f);

	}

}
