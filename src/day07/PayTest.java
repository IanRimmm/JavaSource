package day07;

class Pay{
	int ppp;
	public void payRefer(Pay a) {
		a.ppp = a.ppp + 2000;
	}
	public void payValue(int j) {	// public int payValue(int j){
		j = j + 2000;				//	j = j + 2000; return j;} "������ ����"
	}
}
public class PayTest {
	public static void main(String[] args) {
		Pay p = new Pay();
		p.ppp = 10;		// PayŬ�������� ������� ppp�� ȣ���Ѵ�.
		
		int i = 10;
		
		p.payRefer(p);  //call by reference�� ����  //���Ⱑ �򰥸���
		p.payValue(i); //call by value�� ����	// i = p.payValue(i);�� ������ �ȴ�.
		
		System.out.println(p.payRefer(p);); //��ü�� ����Ǽ� 2010
		System.out.println(i); //10			
	}
}
