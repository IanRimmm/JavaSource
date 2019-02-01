package day12;

public class IR2 {
	
	public static void main(String[] args) {
		//인터페이스 객체변수는 할당되는 객채에 따라 기능을 변경할 수 있습니다.
		B b = new D1();	// upcasting
		//클래스 D1의 객체를 생성하여 memo에 할당
		b.display("석모도 - 보문사 - 벤뎅이 회무침");
		
		b = new D2();
		b.display("대부도  - 방아머리 - 바지락 칼국수");	
		
		//인터페이스 타입은 구현 클래스의 변수에 접근할 수 없습다.
//		System.out.println(b.str);
		//구현 객체의 멤버변수에 접근하려면 인터페이스의 구현 클래스 타입으로 형변환을 해야 합니다.
		D2 d2 = (D2)b;	// downcasting
		System.out.println(d2.str);
		//"대부도 - 방아머리 - 바지락 칼국수"가 나온다. 왜?? 이미 위에서 b.display함수에서 초기화를 시켰기 때문이다.
	}
}

interface B{
	void display(String s);
}

class D1 implements B{
	String str = "";
	public void display(String s) {
		str = s;
		System.out.println("☆☆☆☆☆☆☆☆☆" + s);
	}
}

class D2 implements B{
	String str = "";
	public void display(String s) {
		str = s;
		System.out.println("★★★★★★★★★" + s);
	}
}