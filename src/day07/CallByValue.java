package day07;

class Person{	// public class�� �ϳ�!!
	public String name;
	public int age;
	
	//Ŭ���� ���̶�, �޼ҵ� ���̶� ������ ������
	public Person(String s) {
		this.name = s;
	}
	
	public void setAge(int n) {
		n = 9;
	}
}

public class CallByValue {
	public static void main(String[] args) {
		Person aPerson = new Person("ȫ�浿");
		int a = 33;
		aPerson.setAge(a);
		
		System.out.println(aPerson.age);
	}
}