package day11;

public class MovieTest3 {
	
	public static void main(String[] args) {
		//파라미터가 있는 생성자만 호출합니다.
		Comedy3 com = new Comedy3("21:00", "마파도");
		
//		기본 생성자는 기존에 생성자가 없는 경우만
//		자동으로 만들어집니다.
//		Comedy3 com2 = new Comedy3();
		
		System.out.println(com.time);
		System.out.println(com.name);
	}
}

class Movie3{
	String part = "";
	
	public Movie3(){} //기본생성자
	
	public Movie3(String part) {
		this.part = part;
		System.out.println("Movie3");
	}
}

class Comedy3 extends Movie3{
	String time = "";
	String name = "";
	
	public Comedy3() {}
	
	public Comedy3(String time, String name) {
		//super();	기본생성자를 호출해주는 super();가 있다고 생각해!
		this.time = time;
		this.name = name;
		System.out.println("Comedy");
	}
}
/*	가장 좋은 것은 기본생성자를 만들어 주는 것이다.
	만약 수퍼클래스의 기본생성자가 없다면,
	서브클래스에서 수퍼클래스의 기본생성자를 호출해주는 super();에 String타입의 변수를 넣어주면 괜찮다.
*/