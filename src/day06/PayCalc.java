package day06;
/* 
 * 데이터 클래스
 */
class Pay{
	//멤버 변수, 인스턴트 변수, 필드
	String name; //성명, 문자열 저장	// private String name;
	int bonbong; //본봉, 숫자
	int tax; //세금, 숫자
	int silsu; //실수령액 본봉  - 세금, 숫자
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {		// private으로 멤버변수를 가려주었을 경우에는,
		return name;				// set & get을 써주어야한다!!
	}
	
	public void setBonbong(int bonbong) {
		this.bonbong = bonbong;
	}
	
	public int getBonbong() {
		return bonbong;
	}
/*
 * 데이터 이용 클래스, 시작 클래스
 */
	//2019년1월17일 목요일에 추가 진행한 작업.	- 매개변수 있는 생성자 선언시, 기본생성자 생성 필수!
	public Pay() {}
	public Pay(int bonbong, String name) {
		this.bonbong = bonbong;
		this.name = name;
	}
	
	public int taxCalc() {	// public+리턴타입+메소드네임&[대문자]멤머변수명(파라메타)_카멜표기법	//메소드()는 짝꿍!!
		return (int)(bonbong*0.045 + 0.5);	//리턴형을 선언해놓고 리턴타입을 적어주어야 한다.
	}
	
	public int silsuCalc() {
		return bonbong - tax;
	}

	public void payPrint() {	// void는 return형이 없다!
		System.out.println("----------------");
		System.out.println("---12월 급여 내역---");
		System.out.println("----------------");
		System.out.println("성명 : "+name);
		System.out.println("본봉 : "+bonbong);
		System.out.println("세금 : "+tax);
		System.out.println("실수령액 : "+silsu);
	}
}


class Allowance extends Pay{
	private int year;
	private int child;
	
	Allowance(){
	}
	Allowance(int year, int child, int bonbong, String name){
		setName(name);
		setBonbong(bonbong);
		this.year = year;
		this.child = child;
	}
	
	public void setyear(int year) {
		this.year = year;
	}
	public int getyear() {
		return year;
	}
	
	public void setchild(int child) {
		this.child = child;
	}
	public int getchild() {
		return child;
	}
	
	public int getAllowance() {
		int allowance = 0;
		
		if(year==0) {
			System.out.println("신입사원입니다");
		}else if(year==1) {
			allowance = 200000;
			System.out.println("경력1년입니다.");
		}else if(year==2) {
			allowance = 400000;
			System.out.println("경력2년입니다.");
		}
		else if(year==3) {
			allowance = 600000;
			System.out.println("경력3년입니다.");
		}
		else if(year==4) {
			allowance = 800000;
			System.out.println("경력4년입니다.");
		}
		
		if(year >=1) {
			if(child>1) {
				allowance = allowance + (child*200000);
			}
		}
		return allowance;
	}
	@Override
	public void payPrint() {	// void는 return형이 없다!
		System.out.println("----------------");
		System.out.println("---12월 급여 내역---");
		System.out.println("----------------");
		System.out.println("성명 : "+getName());
		System.out.println("본봉 : "+getBonbong());
		System.out.println("세금 : "+taxCalc());
		System.out.println("수당 : "+getAllowance());
		System.out.println("실수령액 : "+silsuCalc());
	}
	@Override
	public int silsuCalc() {
		// TODO Auto-generated method stub
		return getBonbong() + getAllowance() - taxCalc();
	}
	
}


public class PayCalc {
	
	public static void main(String[] args) {
		Allowance a1 = new Allowance();
		a1.setBonbong(4000000);
		a1.setName("박길동");
		a1.setyear(3);
		a1.setchild(1);
		a1.payPrint();
		
		Allowance a2 = new Allowance(5, 2, 3000000, "이길동"); //Allowance ctrl + spacebar
		
		
		Pay p1 = new Pay();	// 메모리 할당(heap memory)
		Pay p2 = new Pay();
		Pay p3 = new Pay();	// p1,p2,p3는 객체, 객체변수
		
		p1.bonbong = 2000000;	// private을 했을 때, p1.setBonbong(2000000);으로 하면 된다.
		p1.name ="왕눈이";	// p1.에서 점을 찍었을 때, 삼각형은 멤버변수이다.	
		p1.tax = p1.taxCalc();	// 공통 메소드를 호출할 때는 해시코드로 접근해주어햐 하므로, .을 써주어야한다.
		p1.silsu = p1.silsuCalc();
				
		p2.bonbong = 2500000;
		p2.name	= "아로미";
		p2.tax = p2.taxCalc();
		p2.silsu = p2.silsuCalc();
		
		p3.bonbong = 1500000;
		p3.name	= "투투";
		p3.tax = p3.taxCalc();			// 이렇게 하면 좋은 이유! 계산이 쉽고, 작성이 용이하다.
		p3.silsu = p3.bonbong - p3.tax;	// 풀이가 길어지므로, 계산 및 코딩 하다가 실수할 수 있다.
		
		p1.payPrint();
		p2.payPrint();
		p3.payPrint();
		
		//2019년1월17일 목요일에 추가적으로 시행한 작업
		Pay p4 = new Pay(3500000, "홍길동");
	}
}