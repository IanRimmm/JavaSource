package test.day06;

import java.util.Scanner;

class Po{
	//���� �� ���� ������ ��ȣ
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
	
	//�Է¸޼ҵ�
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("���� 2���� ������ ��ȣ(1+,2-,3*,4/,5%)�� �Է��ϼ��� : ");
		s1 = in.nextInt();
		s2 = in.nextInt();
		op = in.nextInt();
	}	
	
	//���޼ҵ�
	public int process() {
		int cal = 0;
		if(op==1) cal = s1+s2;
		else if(op==2) cal = s1-s2;
		else if(op==3) cal = s1*s2;
		else if(op==4) cal = s1/s2;
		else if(op==5) cal = s1%s2;
		else {
			System.out.println("�������� �Է��� �ٸ��� �ʽ��ϴ�.");
		}
		return cal;
	}
	
	//��¸޼ҵ�
	public void print() {
		System.out.println("�Է��� ���� 1 : "+s1);
		System.out.println("�Է��� ���� 2 : "+s2);
		System.out.println("���� �� ������� : "+process());
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
