package day10;

public class MainTest2 {
	public static void main(String args[]) {
		
	}
}

class Person{
	String name;
	String phone;
	static int ID;
	
	public void setName(String s) {
		name = s;
	}
	
	public String getPhone() {
		return phone;
	}
	public static int getID() {
		return ID;
	}
}

class Professor extends Person{
	public void setName(String s) {	//protected�� �θ��� ���������ں��� �������Ƿ� �����߻�!
	}
	public String getPhone() {
		return phone;
	}
	public void getPhone(String phone) { //�����ε� �޼ҵ� �� �Է°��� �޶�� �ϹǷ�! String phone�� ���� ���̴�.
	}
	public int getID2() { //�������̵� : getID�� static�� ����ų�, ���ο� �̸��� �޼ҵ���� ������ָ� �ȴ�.
		return ID;	//���ϰ��� �־��־���Ѵ�.
	}
}