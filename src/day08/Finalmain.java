package day08;

public class Finalmain {
	public static void main(String[] args) {
		Final fi = new Final();
		fi.money = 15000;
		
		System.out.println("1주일 용돈 : "+fi.money*fi.day);
		System.out.println("1년 : "+Final.month+"달");
		
	}
}

class Final{
	int money = 10000;	//인스턴트 변수
	
	final int day = 7;	//1주, final 인스턴트 변수
	final int week = 4;	//한 달, final 인스턴트 변수

	final static int month = 12;	//1년
}