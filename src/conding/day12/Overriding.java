package conding.day12;

public class Overriding {
	public static void main(String[] args) {
		Professor a = new Professor();
		a.setPhone("010-0101-0101");//Professor�� getPhone() ȣ��(�������̵��� �޼ҵ� ȣ��)
		System.out.println(a.getPhone());
		
		Person p = a;	//��ĳ����
		System.out.println(p.getPhone());//�������ε��� ���� Professor�� getPhoneȣ��
	}
}

class Person{
	String phone;
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
}

class Professor extends Person{
	public String getPhone() {//Person�� getPhone()�� �������̵�
		return "Professor : " + super.getPhone(); //Person�� getPhone()�� ȣ��
	}
}