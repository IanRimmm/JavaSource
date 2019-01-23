package day06;

class Pay2{
	
	String name;
	int bonbong;
//	int tax;	멤버변수를 4에서 2개로 줄어줌에 따라서, heap영역에서 사용가능한 메모리가 늘어났다.
//	int silsu;
	
	public int taxCalc(){
		return (int)(this.bonbong*0.045 +0.5);
	}
	
	public int silsuCalc(){
		return bonbong - taxCalc();
	}
	
	public void payPrint() {
		System.out.println("이름 : "+name);
		System.out.println("본봉 : "+bonbong);
		System.out.println("세금 : "+taxCalc());
		System.out.println("실수 : "+silsuCalc());
		System.out.println("");
	}
}

public class PayCalc_2 {
	
	public static void main(String[] args) {
		Pay2 p1 = new Pay2();	//메모리 할당
		Pay2 p2 = new Pay2();
		Pay2 p3 = new Pay2();
		
		p1.bonbong = 2000000;
		p1.name = "눅눅이";

		p2.bonbong = 1000000;
		p2.name = "바바";
		
		p3.bonbong = 1500000;
		p3.name = "립트";
		
		p1.payPrint();
		p2.payPrint();
		p3.payPrint();

	}
}
