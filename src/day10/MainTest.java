package day10;

//메인클래스
public class MainTest {
	public static void main(String args[]) {
		Line a = new Line();
		a.draw();
		
		DObject p = new Line();
		p.draw();		
	}
}

//부모클래스
class DObject {
	public DObject next;
	
	public DObject() {next = null;}
	public void draw() {
		System.out.println("DOject draw");
	}
}

//자식클래스
class Line extends DObject{
	public void draw() {
		System.out.println("Line");
	}
}