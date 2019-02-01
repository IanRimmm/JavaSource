package day07;

class Person{	// public class는 하나!!
	public String name;
	public int age;
	
	//클래스 명이랑, 메소드 명이랑 같으면 생성자
	public Person(String s) {
		this.name = s;
	}
	
	public void setAge(int n) {
		n = 9;
	}
}

public class CallByValue {
	public static void main(String[] args) {
		Person aPerson = new Person("홍길동");
		int a = 33;
		aPerson.setAge(a);
		
		System.out.println(aPerson.age);
	}
}