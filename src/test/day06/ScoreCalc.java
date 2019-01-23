package test.day06;

class Score{		//주석 처리 해놓은 것 중요하니 다시 한 번 씩 읽어보기!!!!!!
	
	//이름, 국어, 수학, 영어, 총점, 평균을 저장할 수 있는 멤버변수 설정
	
	String name;
	double kuk;
	double math;
	double eng;
	double tot;
	double avg;
	
	public double totCalc() {
		return (double)(this.tot = kuk + math + eng);	//this. 해주는게 좋다! 알아보기 쉬움ㅎ
	}
	
	public double avgCalc() {
		return (double)(avg = tot/3);
	}
	
	public void scorePrint() {
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kuk);
		System.out.println("수학 : "+math);
		System.out.println("영어 : "+eng);
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
		System.out.println("");
	}
}

public class ScoreCalc {
	
	public static void main(String[] args) {
		//김길동, 홀길동, 백길동 score 객체 생성
		//멤버 변수 초기화 및 총점, 평균은 계산해서 넣기!
		
		Score s1 = new Score();
		Score s2 = new Score();
		Score s3 = new Score();
		
		s1.name = "김길동";
		s1.kuk = 89.9;
		s1.math = 93.4;
		s1.eng = 81.2;
		//s1.tot = s1.kuk + s1.math + s1.eng;
		//s1.avg = s1.tot/3;
		
		s2.name = "홍길동";
		s2.kuk = 79.2;
		s2.math = 83.7;
		s2.eng = 96.9;
		//s2.tot = s2.kuk + s2.math + s2.eng;
		//s2.avg = s2.tot/3;
		
		s3.name = "백길동";
		s3.kuk = 99.5;
		s3.math = 76.2;
		s3.eng = 87.2;
		//s3.tot = s3.kuk + s3.math + s3.eng;
		//s3.avg = s3.tot/3;
		
		s1.tot = s1.totCalc();
		s1.avg = s2.avgCalc();
		s2.tot = s1.totCalc();
		s2.avg = s2.avgCalc();
		s3.tot = s1.totCalc();
		s3.avg = s2.avgCalc();
		
		s1.scorePrint();
		s2.scorePrint();
		s3.scorePrint();
		
//		System.out.println("이름 : "+s1.name);
//		System.out.println("국어 : "+s1.kuk);
//		System.out.println("수학 : "+s1.math);
//		System.out.println("영어 : "+s1.eng);
//		System.out.println("총점 : "+s1.tot);
//		System.out.println("평균 : "+s1.avg);
//		System.out.println("");
//		
//		System.out.println("이름 : "+s2.name);
//		System.out.println("국어 : "+s2.kuk);
//		System.out.println("수학 : "+s2.math);
//		System.out.println("영어 : "+s2.eng);
//		System.out.println("총점 : "+s2.tot);
//		System.out.println("평균 : "+s2.avg);
//		System.out.println("");
//		
//		System.out.println("이름 : "+s3.name);
//		System.out.println("국어 : "+s3.kuk);
//		System.out.println("수학 : "+s3.math);
//		System.out.println("영어 : "+s3.eng);
//		System.out.println("총점 : "+s3.tot);
//		System.out.println("평균 : "+s3.avg);
	}
}