package test.day06;

class Score2{		//�ּ� ó�� �س��� �� �߿��ϴ� �ٽ� �� �� �� �о��!!!!!!
	
	//�̸�, ����, ����, ����, ����, ����� ������ �� �ִ� ������� ����
	
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
		return (double)(kuk + math + eng);	//this. ���ִ°� ����! �˾ƺ��� ����
	}
	
	public double avgCalc() {
		return (double)(totCalc()/3);
	}
	
	public void scorePrint() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+kuk);
		System.out.println("���� : "+math);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+totCalc());
		System.out.println("��� : "+avgCalc());
		System.out.println("");
	}
}

public class ScoreCalc2 {
	
	public static void main(String[] args) {
		//��浿, Ȧ�浿, ��浿 score ��ü ����
		//��� ���� �ʱ�ȭ �� ����, ����� ����ؼ� �ֱ�!
		
		Score2 s1 = new Score2();	// �ϳ��� Ŭ������ �޸� �Ҵ�� �پ��� ���� ������ �Ǹ� ��ü��� �θ��ϴ�.
		Score2 s2 = new Score2();	//	Ŭ���� + ��ü(��ü����) = new(�޸��Ҵ�) + Ŭ����();
		Score2 s3 = new Score2();	// 
		
		s1.setName("��浿");		//set�� Ȱ���ؼ� ������� Name�� �ʱ�ȭ�Ѵ�.
		s1.setKuk(89.9);
		s1.setMath(93.4);
		s1.setEng(81.2);
		
		s2.setName("ȫ�浿");
		s2.setKuk(79.2);
		s2.setMath(83.7);
		s2.setEng(96.9);
		
		s3.setName("��浿");
		s3.setKuk(99.5);
		s3.setMath(76.2);
		s3.setEng(87.2);
				
		s1.scorePrint();
		s2.scorePrint();
		s3.scorePrint();
		
	}
}