package conding.day12;

public class DowncastingEx2 {
	
	public static void main(String[] args) {
		
		Person2 p = new Student2("Chanho"); //upcasting
		Student2 s;
//		System.out.println(s.name);		//오류, 업캐스팅했으므로 자식클래스에 접근 불가!
		
		s=(Student2)p; //downcasting
		System.out.println(s.name);
		s.grade = "A"; //오류없음
	}
}
class Person2{
	String name;
	String id;
	
	public Person2(String name) {
		this.name = name;
		System.out.println("상위클래스 : " + name);
	}
}

class Student2 extends Person2{
	String grade;
	String department;
	
	public Student2(String name) {
		super(name);
		System.out.println("하위클래스 : " + name);
	}
}