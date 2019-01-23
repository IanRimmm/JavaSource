package day07;

class SchoolVO{
	String name="";
	int kuk=0;
	int eng=0;
	int tot=0;
	int avg=0;
}

class SchoolProc2{
	public void print(SchoolVO vo) {	// 클래스는 필드와 메소드이기 때문에, 여기서 vo는 클래스 타입이다.
		System.out.println("vo.name:" + vo.name);
		System.out.println("vo.kuk:" + vo.kuk);
		System.err.println("vo.eng:" + vo.eng);
		System.out.println("vo.tot:" + vo.tot);
		System.out.println("vo.avg:" + vo.avg);
	}
}

public class SchoolUse2 {
	public static void main(String[] args) {
		SchoolVO vo = new SchoolVO();	// vo는 객체를 가리키는 해쉬코드!
		vo.name = "가길동";
		vo.kuk = 85;
		vo.eng = 80;
		vo.tot = 165;
		vo.avg = 82;
		
		SchoolProc2 sp = new SchoolProc2();
		sp.print(vo);	// Call By Reference
	}
}
