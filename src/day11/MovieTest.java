package day11;

public class MovieTest {
	
	public static void main(String[] args) {
		//기본 생성자는 자동으로 생성되어 사용됩니다.
		Action act = new Action();
		act.name = "마파도";	//이문식
		System.out.println(act.name);
	}
}

class TV{
	
}
class Movie extends TV{
	String part = "한국 영화";
}

class Action extends Movie{
	String name="";
}

//모든 생성자 안에는 부모의 기본생성자를 호출하는 코드가 들어가 있다!