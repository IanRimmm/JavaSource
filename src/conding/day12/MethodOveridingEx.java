package conding.day12;

public class MethodOveridingEx {
	
	public static void main(String[] args) {
	DObject obj = new DObject(); //상위클래스 객체 생성
	Line line = new Line(); //하위클래스 객체 생성(but 상위클래스 객체도 생성됨!)
	DObject p = new Line();	//(메모리를 생성하면서)업캐스팅
	DObject r = line; //업캐스팅
	
	obj.draw(); //상위 클래스 메소드 실행
	line.draw(); //하위 클래스 메소드 실행
	p.draw();	//(오버라이딩된 메소드 실행)동적바인딩	<-	업케스팅은 동적바인딩과 같이 생각!
	r.draw();	//(오버라이딩된 메소드 실행)동적바인딩
	
	DObject rect = new Rect();	//업캐스팅
	DObject circle = new Circle();	//업캐스팅
	rect.draw();	//오버라이딩된 메소드 실행
	circle.draw();	//오버라이딩된 메소드 실행
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
	public void draw() {//메소드 오버라이딩
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