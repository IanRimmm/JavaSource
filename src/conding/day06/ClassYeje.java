package conding.day06;

import java.text.DecimalFormat;

class Circle{
	//멤버변수 및 캡슐화
	private int r;
	
	public void setR(int r) {
		this.r = r;
	}
	int getR(int r) {
		return this.r;
	}
	//넓이,둘레,출력 메소드
	public double Area1() {
		//System.out.println(this.r);	r이 넘어갔는지 출력확인.
		double Area1 = this.r*this.r*Math.PI;	// Math.PI = 원주율
		return Area1;
	}
	public double Circumference1() {
		double Circumference1 = 2*this.r*Math.PI;
		return Circumference1;
	}
	public void print() {
		DecimalFormat dec = new DecimalFormat("#.00");	// "무조건 #.00"으로! 소숫점잡아주기!
		System.out.println("원의 넓이 : "+dec.format(Area1())+"cm^2입니다.");
		System.out.println("원의 둘레 : "+dec.format(Circumference1())+"cm입니다.");
	}
}


class Triangle{
	//멤버변수 및 캡슐화
	private int a;
	private int b;
	private int c;
	
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	int getA(int a) {
		return this.a;
	}
	int getB(int b) {
		return this.b;
	}
	int getC(int c) {
		return this.c;
	}
	
	//넓이, 둘레, 출력 메소드
	public double Area2() {
		double s = (this.a+this.b+this.c)/2;
		double Area2 = Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));	//Math.sqrt : 루트
		return Area2;			// s값이 a,b,c값 중 한 가지와도 똑같다면 값이 안 나오니까 주의!			
	}
	public double Circumference2() {
		double Circumference2 = this.a+this.b+this.c;
		return Circumference2;
	}
	public void print(){
		DecimalFormat dec = new DecimalFormat("#.00");	// 소숫점 잡아주는 것!
		System.out.println("삼각형의 넓이 : "+dec.format(Area2())+"cm^2입니다.");
		System.out.println("삼각형의 둘레 : "+dec.format(Circumference2())+"cm입니다.");
	}
}


class Rectangle{
	//멤버변수 및 캡슐화
	private int d;
	private int e;
	
	public void setD(int d) {
		this.d = d;
	}
	public void setE(int e) {
		this.e = e;
	}
	
	int getD(int d) {
		return this.d;
	}
	int getE(int e) {
		return this.e;
	}
	
	//넓이, 둘레, 출력 메소드
	public double Area3() {
		double Area3 = this.d*this.e;
		return Area3;
	}
	public double Circumference3() {
		double Circumference3 = 2*(this.d+this.e);
		return Circumference3;
	}
	public void print(){
		DecimalFormat dec = new DecimalFormat("#.00");	// 소숫점 잡기!
		System.out.println("사각형의 넓이 : "+dec.format(Area3())+"cm^2입니다.");
		System.out.println("사각형의 둘레 : "+dec.format(Circumference3())+"cm입니다.");
	}
	
}


public class ClassYeje {
	public static void main(String[] args) {
		Circle x = new Circle();
		Triangle y = new Triangle();
		Rectangle z = new Rectangle();
		
		x.setR(15);	//x.r = 1; 이것은 캡슐화 전에!! setR이란 캡슐화한 메소드에 1을 대입한 것 까지 한꺼번에 초기화해야한다.
		y.setA(4);	//y.a = 2;
		y.setB(5);	//y.b = 3;
		y.setC(6);	//y.c = 4;
		z.setD(5);	//z.d = 5;
		z.setE(6);	//z.e = 6;
		
		x.print();
		y.print();
		z.print();
	}
}
