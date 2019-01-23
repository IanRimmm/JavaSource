package test.day06;

class Score2{		//주석 처리 해놓은 것 중요하니 다시 한 번 씩 읽어보기!!!!!!
	
	//이름, 국어, 수학, 영어, 총점, 평균을 저장할 수 있는 멤버변수 설정
	
	private String name;
	private double kuk;
	private double math;
	private double eng;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setKuk(double kuk){
		this.kuk = kuk;
	}
	public double getKuk() {
		return kuk;
	}
	
	public void setMath(double math) {
		this.math = math;
	}
	public double getMath() {
		return math;
	}
	
	public void setEng(double eng) {
		this.eng = eng;
	}
	public double getEng() {
		return eng;
	}
	
	public double totCalc() {
		return (double)(kuk + math + eng);	//this. 해주는게 좋다! 알아보기 쉬움ㅎ
	}
	
	public double avgCalc() {
		return (double)(totCalc()/3);
	}
	
	public void scorePrint() {
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kuk);
		System.out.println("수학 : "+math);
		System.out.println("영어 : "+eng);
		System.out.println("총점 : "+totCalc());
		System.out.println("평균 : "+avgCalc());
		System.out.println("");
	}
}

public class ScoreCalc2 {
	
	public static void main(String[] args) {
		//김길동, 홀길동, 백길동 score 객체 생성
		//멤버 변수 초기화 및 총점, 평균은 계산해서 넣기!
		
		Score2 s1 = new Score2();	// 하나의 클래스는 메모리 할당시 다양한 값을 가지게 되며 객체라고 부릅니다.
		Score2 s2 = new Score2();	//	클래스 + 객체(객체변수) = new(메모리할당) + 클래스();
		Score2 s3 = new Score2();	// 
		
		s1.setName("김길동");		//set을 활용해서 멤버변수 Name을 초기화한다.
		s1.setKuk(89.9);
		s1.setMath(93.4);
		s1.setEng(81.2);
		
		s2.setName("홍길동");
		s2.setKuk(79.2);
		s2.setMath(83.7);
		s2.setEng(96.9);
		
		s3.setName("백길동");
		s3.setKuk(99.5);
		s3.setMath(76.2);
		s3.setEng(87.2);
				
		s1.scorePrint();
		s2.scorePrint();
		s3.scorePrint();
		
	}
}