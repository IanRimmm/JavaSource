package day15;

import java.util.Vector;

public class VectorTest2 {

	public static void main(String[] args) {
		int i = 0;
		
		//sungjuk ��ü ����
		Sungjuk s = null;
		Sungjuk s1 = new Sungjuk("��ȹ��", 100, 80);
		Sungjuk s2 = new Sungjuk("������", 80, 90);
		Sungjuk s3 = new Sungjuk("������", 90, 80);
		
		//Vector�� ��� ����
		Vector v = new Vector();
		v.addElement(s1);
		v.addElement(s2);
		v.addElement(s3);
		
		//Vector�� ����� Sungjuk ��ü �����Ͽ� ���
		for(i=0;i<v.size();i++) {
			s = (Sungjuk)v.get(i);
			//Escape Sequence�� ���ڿ� �źο� Ư���� ���ڸ� �����ϴ� �� ����Ѵ�!
			System.out.println(s.name + "\t");
			System.out.println(s.kuk + "\t");
			System.out.println(s.eng + "\t");
			System.out.println(s.tot + "\t");
			System.out.println(s.avg + "\t\n");
		}
	}

}

class Sungjuk{
	//�������
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