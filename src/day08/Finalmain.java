package day08;

public class Finalmain {
	public static void main(String[] args) {
		Final fi = new Final();
		fi.money = 15000;
		
		System.out.println("1���� �뵷 : "+fi.money*fi.day);
		System.out.println("1�� : "+Final.month+"��");
		
	}
}

class Final{
	int money = 10000;	//�ν���Ʈ ����
	
	final int day = 7;	//1��, final �ν���Ʈ ����
	final int week = 4;	//�� ��, final �ν���Ʈ ����

	final static int month = 12;	//1��
}