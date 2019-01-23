package day11;

public class ThisTest {

	public static void main(String[] args) {
		This obj1 = new This();
		obj1.area = "인천시";
		obj1.prn();	//객체의 Hashcode가 prn()메소드로 호출됩니다.
		System.out.println("obj.HashCode():" + obj1.hashCode());
		
	}
}

class This{
	String area = "";
	
	public void prn() {
		System.out.println("이 메소드를 호출한 객체의 HashCode:" + this);
		System.out.println(this.area);
	}
}