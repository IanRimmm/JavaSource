package day10;

//����Ŭ����
public class MainTest {
	public static void main(String args[]) {
		Line a = new Line();
		a.draw();
		
		DObject p = new Line();
		p.draw();		
	}
}

//�θ�Ŭ����
class DObject {
	public DObject next;
	
	public DObject() {next = null;}
	public void draw() {
		System.out.println("DOject draw");
	}
}

//�ڽ�Ŭ����
class Line extends DObject{
	public void draw() {
		System.out.println("Line");
	}
}