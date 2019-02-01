package day18;

/*
 [����]
 class Classname<type paramater>{ //... class body}
 */
public class GenericClassExample {

	public static void main(String[] args) {
		SimpleGeneric<Integer> gInteger = new SimpleGeneric<Integer>(10);
		SimpleGeneric<Double> gDouble = new SimpleGeneric<Double>(10);
		gInteger.add(1, 2);
		gInteger.add(1, 2, 3, 4, 5, 6, 7);
		gInteger.add(0);
		gInteger.print();	// values 10���� �濡 �����ؼ� 1���� ����Ѵٰ� �����ϸ� �ȴ�.
		gDouble.add(10.0, 20.0, 30.0);
		gDouble.print();
	}
}
/*
 [Generic Ŭ����]
 ���ʸ� Ŭ������ �� �Ű������� ������ Ŭ�����Դϴ�.
 ���Ű������� ��ü�� ���� �� ���޹����� �Ӽ��̳� �޼ҵ��� �ڷ������� ���˴ϴ�.
 */
class SimpleGeneric<T> {
	private T[] values;
	private int index;

	SimpleGeneric(int len) {
		values = (T[]) new Object[len];	//Object�� T[]�� �ٿ�ĳ����!
		index = 0;
	}
	
	public void add(T... args) {	//TŸ���� ���� args�� ���� �� �ִ� ������ ������ ����! ex) 2�� ������ for�� 2�� ������.
		for (T e : args)			// �ݷ��� ���� -> (�� : ��) = �������� ���?�� ���ʿ� �ϳ��� �������� ��.
			values[index++] = e;	// index = 0�� ++�ؼ� 1�� �־��ش�.
	}

	public void print() {
		for (T e : values)
			System.out.println(e + " ");
		System.out.println();
	}
}