package day11;

public class MovieTest2 {

	public static void main(String[] args) {
		// 기본 생성자는 자동으로 생성되어 사용됩니다.
		Action2 act = new Action2();
		act.name = "마파도";
		System.out.println(act.name);
	}
}

class TV2 {
	public TV2() {
		super();	//첫 라인에는 부모의 생성자를 호출하는 것이 들어있다.
		System.out.println("TV2");
	}
}

class Movie2 extends TV2 {	//ex) TV라고 했을 때, 상속 관계가 아니므로, Movie2까지만 출력됨!
	String part = "한국 영화";

	public Movie2() {
		System.out.println("Movie2");
	}
}

class Action2 extends Movie2 {
	String name = "";

	public Action2() {
		System.out.println("Action2");
	}
}