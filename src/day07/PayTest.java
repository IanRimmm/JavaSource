package day07;

class Pay{
	int ppp;
	public void payRefer(Pay a) {
		a.ppp = a.ppp + 2000;
	}
	public void payValue(int j) {	// public int payValue(int j){
		j = j + 2000;				//	j = j + 2000; return j;} "리턴한 것을"
	}
}
public class PayTest {
	public static void main(String[] args) {
		Pay p = new Pay();
		p.ppp = 10;		// Pay클래스에서 만들어진 ppp를 호출한다.
		
		int i = 10;
		
		p.payRefer(p);  //call by reference로 전달  //여기가 헷갈리네
		p.payValue(i); //call by value로 전달	// i = p.payValue(i);로 받으면 된다.
		
		System.out.println(p.payRefer(p);); //객체가 변경되서 2010
		System.out.println(i); //10			
	}
}
