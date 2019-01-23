package day11;

public class SuperExam {
	
	public static void main(String[] args) {
		SubOverC over1 = new SubOverC(10, 20, 30);	//자식 객체를 생성했으니까, 부모와 자식 둘 다 객체 생성!
		
		//위의 자식 객체 값 대입
		System.out.println("i,j,k의 값 : "+ over1.i+ " " + over1.j+ " " + over1.k);
		
//		자식 클래스의 void show(); 호출
//		System.out.println("하위 클래스의 메소드 show() 수행");
//		System.out.println("==-super를 이용항 상위 클래스 메소드 호출===");
//		super.show();
		over1.show();
	}
}

class OverC{
	int i,j;
	
	//생성자
	public OverC(int i, int j) {
		this.i = i; //10
		this.j = j; //20
	}
	
	void show() {
		System.out.println("상위클래스의 메소드 show() 수행");

	}
}

class SubOverC extends OverC{
	int k;
	
	//int i : 부모클래스
	//int j : 부모클래스
	//int k : 부모클래스
	
	public SubOverC(int i, int j,int k) {
		super(i, j); //상위 클래스의 생성자를 호출
		this.k = k;  //k만 10으로 초기화를 합니다.
	}
	
	void show() {
		System.out.println("하위 클래스의 메소드 show() 수행");
		System.out.println("==-super를 이용항 상위 클래스 메소드 호출===");
		super.show();
	}
}