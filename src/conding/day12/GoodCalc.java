package conding.day12;

public class GoodCalc extends Calculator{
	
	public static void main(String[] args) {
		Calculator cal = new GoodCalc(); //업캐스팅
		System.out.println(cal.add(4, 5));
		System.out.println(cal.substract(4, 5));
		System.out.println(cal.average(new int[] {2,3,4}));//day11 AbsMain과 비교!
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum/a.length;	// return값은 for문 밖에!
	}
}

abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int substract(int a, int b);
	public abstract double average(int[] a);
}