package day12;

public class Myinfouse {
	
	/*
	 @param args
	 */
	public static void main(String[] args) {
		// upcasting
		Myinfointer info = new Myinfo("�Ʒι�","010-0101-0101", "��õ�� ������", 35);
		
		System.out.println("�̸� : "+ info.getName());
		System.out.println("��ȭ : "+ info.getPhone());
//		System.out.println("�ּ� : "+ info.getAddredss);
//		System.out.println("���� : "+ info.getAge());
	}
}

interface Myinfointer{
	String getName();
	String getPhone();
}

class Myinfo implements Myinfointer{
	private String name;
	private String phone;
	private String address;
	private int age;
	
	//�⺻������
	Myinfo(){}
	//�Ķ���ͻ�����
	Myinfo(String name, String phone, String address, int age){
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.age = age;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		return age;
	}
}