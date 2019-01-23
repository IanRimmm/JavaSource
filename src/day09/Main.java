package day09;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
//		b.setM(100);
//		b.setN(50);
		
		System.out.println(a);
		System.out.println(b);
	}
}

class A{
	public int p;
	public int n;
	public void setN(int n) {
		this.n = n;
	}
	public int getN() {
		return n;
	}

}

class B extends A{
	private int m;
	public void setM(int m) {
		this.m = m;
	}
	public int getM() {
		return m;
	}
	public String toString() {
		String s = getN() + " " + getM();
		return s;
	}
}
