package test.day06;

class Score{		//�ּ� ó�� �س��� �� �߿��ϴ� �ٽ� �� �� �� �о��!!!!!!
	
	//�̸�, ����, ����, ����, ����, ����� ������ �� �ִ� ������� ����
	
	String name;
	double kuk;
	double math;
	double eng;
	double tot;
	double avg;
	
	public double totCalc() {
		return (double)(this.tot = kuk + math + eng);	//this. ���ִ°� ����! �˾ƺ��� ����
	}
	
	public double avgCalc() {
		return (double)(avg = tot/3);
	}
	
	public void scorePrint() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+kuk);
		System.out.println("���� : "+math);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+tot);
		System.out.println("��� : "+avg);
		System.out.println("");
	}
}

public class ScoreCalc {
	
	public static void main(String[] args) {
		//��浿, Ȧ�浿, ��浿 score ��ü ����
		//��� ���� �ʱ�ȭ �� ����, ����� ����ؼ� �ֱ�!
		
		Score s1 = new Score();
		Score s2 = new Score();
		Score s3 = new Score();
		
		s1.name = "��浿";
		s1.kuk = 89.9;
		s1.math = 93.4;
		s1.eng = 81.2;
		//s1.tot = s1.kuk + s1.math + s1.eng;
		//s1.avg = s1.tot/3;
		
		s2.name = "ȫ�浿";
		s2.kuk = 79.2;
		s2.math = 83.7;
		s2.eng = 96.9;
		//s2.tot = s2.kuk + s2.math + s2.eng;
		//s2.avg = s2.tot/3;
		
		s3.name = "��浿";
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
		
//		System.out.println("�̸� : "+s1.name);
//		System.out.println("���� : "+s1.kuk);
//		System.out.println("���� : "+s1.math);
//		System.out.println("���� : "+s1.eng);
//		System.out.println("���� : "+s1.tot);
//		System.out.println("��� : "+s1.avg);
//		System.out.println("");
//		
//		System.out.println("�̸� : "+s2.name);
//		System.out.println("���� : "+s2.kuk);
//		System.out.println("���� : "+s2.math);
//		System.out.println("���� : "+s2.eng);
//		System.out.println("���� : "+s2.tot);
//		System.out.println("��� : "+s2.avg);
//		System.out.println("");
//		
//		System.out.println("�̸� : "+s3.name);
//		System.out.println("���� : "+s3.kuk);
//		System.out.println("���� : "+s3.math);
//		System.out.println("���� : "+s3.eng);
//		System.out.println("���� : "+s3.tot);
//		System.out.println("��� : "+s3.avg);
	}
}