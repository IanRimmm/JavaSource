package day10;

public class UpcastingEx {
	public static void main(String[] agrgs) {
		
		Person2 p;
		Student s = new Student("���繮");
		p = s; //pŸ��(�θ�)���� s�� �����ϸ�, ��ĳ���� �߻�
//		Person2 p = new Student("���繮");	���� �� ���� �� �� �ٰ� ����!!(�׷��� �ؽ��ڵ� ���� �ٸ���!!)
		Student s2 = (Student) p;	// �ڽ� + ���� = (�ڽ�Ÿ��) + �θ𺯼�, �ٿ�ĳ���� �߻�
		
		System.out.println(p.name); //���� ����. �������ε�
//		p.grade = "A";			�����Ͽ���
//		p.department = "Com"	�����Ͽ���
	}
}

class Person2{
	String name;
	String id;
	
	public Person2(String name) {
		this.name = name;
	}
}

class Student extends Person2{
	String Grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}