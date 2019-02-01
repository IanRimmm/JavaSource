package conding.day13;

public class SungjukTest {
	
	public static void main(String[] args) {
		// ERROR
		// ISungjuk iis = new ISungjuk();	//인터페이스는 객체로 생성 할 수 없기 때문에, 실행되지 않는다.
		
		ISungjuk is = new Sungjuk();	//upcasting
		is.setJumsu(90, 85);
		is.print();
	}
}

interface ISungjuk{
	public void setJumsu(int kuk, int eng);
	public abstract void print();
}

class Sungjuk implements ISungjuk{
	int kuk = 0; //국어
	int eng = 0; //영어
	
	@Override
	public void setJumsu(int kuk, int eng) {
		this.kuk = kuk;
		this.eng = eng;
	}
	
	@Override
	public void print() {
		System.out.println("성적 증명서");
		System.out.println("국어 : "+this.kuk);
		System.out.println("영어 : "+this.eng);
	}
}