package day12;

public class IR2 {
	
	public static void main(String[] args) {
		//�������̽� ��ü������ �Ҵ�Ǵ� ��ä�� ���� ����� ������ �� �ֽ��ϴ�.
		B b = new D1();	// upcasting
		//Ŭ���� D1�� ��ü�� �����Ͽ� memo�� �Ҵ�
		b.display("���� - ������ - ������ ȸ��ħ");
		
		b = new D2();
		b.display("��ε�  - ��ƸӸ� - ������ Į����");	
		
		//�������̽� Ÿ���� ���� Ŭ������ ������ ������ �� ������.
//		System.out.println(b.str);
		//���� ��ü�� ��������� �����Ϸ��� �������̽��� ���� Ŭ���� Ÿ������ ����ȯ�� �ؾ� �մϴ�.
		D2 d2 = (D2)b;	// downcasting
		System.out.println(d2.str);
		//"��ε� - ��ƸӸ� - ������ Į����"�� ���´�. ��?? �̹� ������ b.display�Լ����� �ʱ�ȭ�� ���ױ� �����̴�.
	}
}

interface B{
	void display(String s);
}

class D1 implements B{
	String str = "";
	public void display(String s) {
		str = s;
		System.out.println("�١١١١١١١١�" + s);
	}
}

class D2 implements B{
	String str = "";
	public void display(String s) {
		str = s;
		System.out.println("�ڡڡڡڡڡڡڡڡ�" + s);
	}
}