package day15;

import java.util.Vector;

public class VectorTest2 {

	public static void main(String[] args) {
		int i = 0;
		
		//sungjuk 객체 생성
		Sungjuk s = null;
		Sungjuk s1 = new Sungjuk("기획자", 100, 80);
		Sungjuk s2 = new Sungjuk("설계자", 80, 90);
		Sungjuk s3 = new Sungjuk("개발자", 90, 80);
		
		//Vector에 요소 저장
		Vector v = new Vector();
		v.addElement(s1);
		v.addElement(s2);
		v.addElement(s3);
		
		//Vector에 저장된 Sungjuk 객체 추출하여 출력
		for(i=0;i<v.size();i++) {
			s = (Sungjuk)v.get(i);
			//Escape Sequence는 문자열 매부에 특수한 문자를 정의하는 데 사용한다!
			System.out.println(s.name + "\t");
			System.out.println(s.kuk + "\t");
			System.out.println(s.eng + "\t");
			System.out.println(s.tot + "\t");
			System.out.println(s.avg + "\t\n");
		}
	}

}

class Sungjuk{
	//멤버변수
	String name = "";
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	int avg = 0;
	public Sungjuk() {}
	public Sungjuk(String name,int kuk,int eng) {
			this.name = name;
			this.kuk = kuk;
			this.eng = eng;
			this.tot = tot;
			this.avg = avg;
	}
}