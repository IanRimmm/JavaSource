package day11;

abstract class Calculator {
	public abstract int add(int a, int b);

	public abstract int subtract(int a, int b);

	public abstract double average(int[] a);
}

class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return (a-b)*(-1);
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}		
		return sum/a.length;
	}
	
}

public class AbsMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GoodCalc cal = new GoodCalc();
		int[] num = {1,2,3,4,5,6,7,8,10};
		System.out.println(cal.add(10, 20));
		System.out.println(cal.subtract(10, 20));
		System.out.println(cal.average(num));
		
	}

}