package conding.day12;

public class MethodOveridingEx {
	
	public static void main(String[] args) {
	DObject obj = new DObject(); //����Ŭ���� ��ü ����
	Line line = new Line(); //����Ŭ���� ��ü ����(but ����Ŭ���� ��ü�� ������!)
	DObject p = new Line();	//(�޸𸮸� �����ϸ鼭)��ĳ����
	DObject r = line; //��ĳ����
	
	obj.draw(); //���� Ŭ���� �޼ҵ� ����
	line.draw(); //���� Ŭ���� �޼ҵ� ����
	p.draw();	//(�������̵��� �޼ҵ� ����)�������ε�	<-	���ɽ����� �������ε��� ���� ����!
	r.draw();	//(�������̵��� �޼ҵ� ����)�������ε�
	
	DObject rect = new Rect();	//��ĳ����
	DObject circle = new Circle();	//��ĳ����
	rect.draw();	//�������̵��� �޼ҵ� ����
	circle.draw();	//�������̵��� �޼ҵ� ����
	}
}

class DObject{
	public DObject next;
	
	public DObject() {next = null;}
	public void draw() {
		System.out.println("DObject draw");
	}
}

class Line extends DObject{
	public void draw() {//�޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends DObject{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends DObject{
	public void draw() {
		System.out.println("Circle");
	}
}