package test.day06;

import java.util.Scanner;

class Po{
	//숫자 두 개와 연선자 번호
	private int s1;
	private int s2;
	private int op;
	
	public void setS1(int s1) {
		this.s1 = s1;
	}
	public void setS2(int s2) {
		this.s2 = s2;
	}
	public void setOP(int op) {
		this.op = op;
	}
	int getS1() {
		return this.s1;
	}
	int getS2() {
		return this.s2;
	}
	int getOP() {
		return this.op;
	}
	
	//입력메소드
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 2개와 연산자 번호(1+,2-,3*,4/,5%)를 입력하세요 : ");
		s1 = in.nextInt();
		s2 = in.nextInt();
		op = in.nextInt();
	}	
	
	//계산메소드
	public int process() {
		int cal = 0;
		if(op==1) cal = s1+s2;
		else if(op==2) cal = s1-s2;
		else if(op==3) cal = s1*s2;
		else if(op==4) cal = s1/s2;
		else if(op==5) cal = s1%s2;
		else {
			System.out.println("연산자의 입력이 바르지 않습니다.");
		}
		return cal;
	}
	
	//출력메소드
	public void print() {
		System.out.println("입력한 숫자 1 : "+s1);
		System.out.println("입력한 숫자 2 : "+s2);
		System.out.println("연산 후 결과값은 : "+process());
	}
	
}
public class Last {
	public static void main(String[] args) {
		Po p1 = new Po();
		p1.input();
		p1.process();
		p1.print();
	}
}
