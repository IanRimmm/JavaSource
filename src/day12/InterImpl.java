package day12;

public class InterImpl implements Inter{
	
	@Override
	public int add(int i, int j) {
		return i+j;
	}
	@Override
	public int sub(int i, int j){
		return i-j;
	}
	
	public static void main(String[] args) {
		InterImpl interImpl = new InterImpl();	//subclass 객체 생성
		System.out.println(interImpl.add(10, 5));
		System.out.println(interImpl.sub(10, 5));
		
		//인터페이스는 기능이 구현되어 있지않음으로
		//객체를 생성할 수 없습니다.
		//Inter inter = new Inter();
		
		//인터페이스는 구현 클래스를 할당 받을 수 있습니다.
		//인터페이스 = 구현 클래스
		
		Inter inter2 = new InterImpl();	//upcasting
		System.out.println(inter2.add(100, 50));
		System.out.println(inter2.sub(100, 50));
		
	}
}

interface Inter{
	
	/*abstract*/ int add(int i, int j); //Interface는 상수와, 추상메소드로 이루어지므로 abstract를 안 써도 된다!
	
	int sub(int i, int j);
}