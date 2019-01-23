package day03;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year =5;
		int child=0;
		int pay =1500000;
		
		if(year==0) {
			System.out.println("신입사원입니다");
		}else if(year==1) {
			pay= pay+20000;
			System.out.println("경력1년입니다.");
		}else if(year==2) {
			pay= pay+40000;
			System.out.println("경력2년입니다.");
		}
		else if(year==3) {
			pay= pay+60000;
			System.out.println("경력3년입니다.");
		}
		else if(year==4) {
			pay= pay+80000;
			System.out.println("경력4년입니다.");
		}
		
		//자녀 수당 계산
		if(year >=1) {
			if(child>1) {
				pay= pay+(child*200000);
			}
		}
		System.out.println("기본급"+pay);
		System.out.println("연봉"+(pay*13));
		System.out.println("월급여"+((pay*13)/12));
	}

}
