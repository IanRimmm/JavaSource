package conding.day12;

public class DowncastingEx2 {
	
	public static void main(String[] args) {
		
		Person2 p = new Student2("Chanho"); //upcasting
		Student2 s;
//		System.out.println(s.name);		//����, ��ĳ���������Ƿ� �ڽ�Ŭ������ ���� �Ұ�!
		
		s=(Student2)p; //downcasting
		System.out.println(s.name);
		s.grade = "A"; //��������
	}
}
class Person2{
	String name;
	String id;
	
	public Person2(String name) {
		this.name = name;
		System.out.println("����Ŭ���� : " + name);
	}
}

class Student2 extends Person2{
	String grade;
	String department;
	
	public Student2(String name) {
		super(name);
		System.out.println("����Ŭ���� : " + name);
	}
}