package day06;

class Pay2{
	
	String name;
	int bonbong;
//	int tax;	��������� 4���� 2���� �پ��ܿ� ����, heap�������� ��밡���� �޸𸮰� �þ��.
//	int silsu;
	
	public int taxCalc(){
		return (int)(this.bonbong*0.045 +0.5);
	}
	
	public int silsuCalc(){
		return bonbong - taxCalc();
	}
	
	public void payPrint() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+bonbong);
		System.out.println("���� : "+taxCalc());
		System.out.println("�Ǽ� : "+silsuCalc());
		System.out.println("");
	}
}

public class PayCalc_2 {
	
	public static void main(String[] args) {
		Pay2 p1 = new Pay2();	//�޸� �Ҵ�
		Pay2 p2 = new Pay2();
		Pay2 p3 = new Pay2();
		
		p1.bonbong = 2000000;
		p1.name = "������";

		p2.bonbong = 1000000;
		p2.name = "�ٹ�";
		
		p3.bonbong = 1500000;
		p3.name = "��Ʈ";
		
		p1.payPrint();
		p2.payPrint();
		p3.payPrint();

	}
}
