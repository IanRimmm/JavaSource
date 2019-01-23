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
	public void setName(String s) {	//protected는 부모의 접근제한자보다 좁아지므로 문제발생!
	}
	public String getPhone() {
		return phone;
	}
	public void getPhone(String phone) { //오버로딩 메소드 내 입력값이 달라야 하므로! String phone을 써준 것이다.
	}
	public int getID2() { //오버라이딩 : getID의 static을 지우거나, 새로운 이름의 메소드명을 만들어주면 된다.
		return ID;	//리턴값을 넣어주어야한다.
	}
}