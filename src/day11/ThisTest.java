package day11;

public class ThisTest {

	public static void main(String[] args) {
		This obj1 = new This();
		obj1.area = "��õ��";
		obj1.prn();	//��ü�� Hashcode�� prn()�޼ҵ�� ȣ��˴ϴ�.
		System.out.println("obj.HashCode():" + obj1.hashCode());
		
	}
}

class This{
	String area = "";
	
	public void prn() {
		System.out.println("�� �޼ҵ带 ȣ���� ��ü�� HashCode:" + this);
		System.out.println(this.area);
	}
}