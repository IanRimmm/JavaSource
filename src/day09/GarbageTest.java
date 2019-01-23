package day09;

public class GarbageTest {
	public static void main(String[] args) {
		//객체 생성
		Garbage[] ga = new Garbage[10];
		for(int i=0;i<ga.length;i++) {
			ga[i] = new Garbage(i);
		}
		
		//객체 메모리 해제
		for(int i=0;i<ga.length;i++) {
			ga[i] = null;	//메모리 회수의 대상이 된다.
		}
		
		//강제로 GC 기능 수행
		System.gc();
	}
}

class Garbage{
	int objNO;
	
	public Garbage(int n) {	//생성자는 멤버변수 초기화
		objNO = n;
		System.out.println("Garbage class" + objNO +"이 만들어 졌습니다.");
		
	}
	
	protected void finalize() throws Throwable{
		System.out.println("Garbage class" + objNO + "에서 쓰이던 메모리가 수집되었습니다.");
		super.finalize();
	}
}