package test.day06;

public class ScoreCalc3 {
	
	public static void main(String[] args) {
		
		Grade a1 = new Grade("김길동",80,60,55);
		a1.scorePrint();
		
		Grade a2 = new Grade();
		a2.setEng(80);
		a2.setKuk(70);
		a2.setMath(95);
		a2.setName("박길동");
		a2.scorePrint();
	}
}

class Score{
	
	private String name;
	private double kuk;
	private double math;
	private double eng;
	private double tot;
	private double avg;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setKuk(double kuk) {
		this.kuk = kuk;
	}
	public double getKuk() {
		return this.kuk = kuk;
	}
	
	public void setEng(double eng) {
		this.eng = eng;
	}
	public double getEng() {
		return this.eng = eng;
	}
	
	public void setMath(double math) {
		this.math = math;
	}
	public double getMath() {
		return this.math;
	}
	
	public double totCalc() {
		return this.kuk+this.eng+this.math;
	}
	public double avgCalc() {
		return this.totCalc()/3;
	}
	
	public void scorePrint() {
		System.out.println("----------------");
		System.out.println("이름 : "+this.name);
		System.out.println("국어 : "+this.kuk);
		System.out.println("영어 : "+this.eng);
		System.out.println("수학 : "+this.math);
		System.out.println("총점 : "+this.totCalc());
		System.out.println("평균 : "+this.avgCalc());
		System.out.println("----------------");
	}
	
}

class Grade extends Score{
	
	public Grade() {}
	public Grade(String name, double kuk, double eng, double math) {
		setName(name);
		setKuk(kuk);
		setEng(eng);
		setMath(math);
	}
	
	public char getGrade() {
		if(avgCalc()>=90&&avgCalc()<=100) {
			return 'A';
		}else if(avgCalc()>=80&&avgCalc()<=89) {
			return 'B';
		}else if(avgCalc()>=70&&avgCalc()<=79) {
			return 'C';
		}else if(avgCalc()>=60&&avgCalc()<=69) {
			return 'D';
		}else {
			return 'F';
		}
	}
	
	@Override
	public void scorePrint() {
		System.out.println("----------------");
		System.out.println("이름 : "+getName());
		System.out.println("국어 : "+getKuk());
		System.out.println("영어 : "+getEng());
		System.out.println("수학 : "+getMath());
		System.out.println("총점 : "+totCalc());
		System.out.println("평균 : "+avgCalc());
		System.out.println("등급 : "+getGrade());
		System.out.println("----------------");
	}
}