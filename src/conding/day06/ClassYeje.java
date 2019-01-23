package conding.day06;

import java.text.DecimalFormat;

class Circle{
	//������� �� ĸ��ȭ
	private int r;
	
	public void setR(int r) {
		this.r = r;
	}
	int getR(int r) {
		return this.r;
	}
	//����,�ѷ�,��� �޼ҵ�
	public double Area1() {
		//System.out.println(this.r);	r�� �Ѿ���� ���Ȯ��.
		double Area1 = this.r*this.r*Math.PI;	// Math.PI = ������
		return Area1;
	}
	public double Circumference1() {
		double Circumference1 = 2*this.r*Math.PI;
		return Circumference1;
	}
	public void print() {
		DecimalFormat dec = new DecimalFormat("#.00");	// "������ #.00"����! �Ҽ�������ֱ�!
		System.out.println("���� ���� : "+dec.format(Area1())+"cm^2�Դϴ�.");
		System.out.println("���� �ѷ� : "+dec.format(Circumference1())+"cm�Դϴ�.");
	}
}


class Triangle{
	//������� �� ĸ��ȭ
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
	
	//����, �ѷ�, ��� �޼ҵ�
	public double Area2() {
		double s = (this.a+this.b+this.c)/2;
		double Area2 = Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));	//Math.sqrt : ��Ʈ
		return Area2;			// s���� a,b,c�� �� �� �����͵� �Ȱ��ٸ� ���� �� �����ϱ� ����!			
	}
	public double Circumference2() {
		double Circumference2 = this.a+this.b+this.c;
		return Circumference2;
	}
	public void print(){
		DecimalFormat dec = new DecimalFormat("#.00");	// �Ҽ��� ����ִ� ��!
		System.out.println("�ﰢ���� ���� : "+dec.format(Area2())+"cm^2�Դϴ�.");
		System.out.println("�ﰢ���� �ѷ� : "+dec.format(Circumference2())+"cm�Դϴ�.");
	}
}


class Rectangle{
	//������� �� ĸ��ȭ
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
	
	//����, �ѷ�, ��� �޼ҵ�
	public double Area3() {
		double Area3 = this.d*this.e;
		return Area3;
	}
	public double Circumference3() {
		double Circumference3 = 2*(this.d+this.e);
		return Circumference3;
	}
	public void print(){
		DecimalFormat dec = new DecimalFormat("#.00");	// �Ҽ��� ���!
		System.out.println("�簢���� ���� : "+dec.format(Area3())+"cm^2�Դϴ�.");
		System.out.println("�簢���� �ѷ� : "+dec.format(Circumference3())+"cm�Դϴ�.");
	}
	
}


public class ClassYeje {
	public static void main(String[] args) {
		Circle x = new Circle();
		Triangle y = new Triangle();
		Rectangle z = new Rectangle();
		
		x.setR(15);	//x.r = 1; �̰��� ĸ��ȭ ����!! setR�̶� ĸ��ȭ�� �޼ҵ忡 1�� ������ �� ���� �Ѳ����� �ʱ�ȭ�ؾ��Ѵ�.
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
