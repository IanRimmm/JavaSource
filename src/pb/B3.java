package pb;

import pa.A3;

public class B3 extends A3{
	void set() {
//	i = 1;		//i�� default ���, ������ ����
	pro = 2;
//	pri = 3;	//private ��� ���� �Ұ�, ������ ���� �߻�
	pub = 4;
	}
	public static void main(String[] args) {
		B3 b = new B3();
		b.set();
	}
}