package day10;

public class UpcastingEx {
	public static void main(String[] agrgs) {
		
		Person2 p;
		Student s = new Student("이재문");
		p = s; //p타입(부모)에다 s를 대입하면, 업캐스팅 발생
//		Person2 p = new Student("이재문");	위의 세 줄이 이 한 줄과 동일!!(그러나 해쉬코드 값은 다르다!!)
		Student s2 = (Student) p;	// 자식 + 변수 = (자식타입) + 부모변수, 다운캐스팅 발생
		
		System.out.println(p.name); //오류 없음. 동적바인딩
//		p.grade = "A";			컴파일오류
//		p.department = "Com"	컴파일오류
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