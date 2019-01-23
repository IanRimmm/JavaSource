package day11;

public class SubObject extends SuperObject{
	
	protected String name;
	public void draw() {
		name = "Sub";
		super.name = "Super";	// ���� Ŭ������ protected String name;���� ����.
		super.draw();	// public void draw(){}�� ����.
		System.out.println(name);
	}
	public static void main(String[] args) {
		SuperObject b = new SubObject();
		b.point();
	}
}

class SuperObject{
	protected String name;
	public void point() {
		draw();
//		System.out.println(name);
	}
	
	public void draw() {
		System.out.println(name);
	}
}