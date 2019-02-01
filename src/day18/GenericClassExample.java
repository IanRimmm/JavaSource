package day18;

/*
 [정의]
 class Classname<type paramater>{ //... class body}
 */
public class GenericClassExample {

	public static void main(String[] args) {
		SimpleGeneric<Integer> gInteger = new SimpleGeneric<Integer>(10);
		SimpleGeneric<Double> gDouble = new SimpleGeneric<Double>(10);
		gInteger.add(1, 2);
		gInteger.add(1, 2, 3, 4, 5, 6, 7);
		gInteger.add(0);
		gInteger.print();	// values 10개의 방에 접근해서 1개씩 출력한다고 생각하면 된다.
		gDouble.add(10.0, 20.0, 30.0);
		gDouble.print();
	}
}
/*
 [Generic 클래스]
 제너릭 클래스는 형 매개변수를 가지는 클래스입니다.
 형매개변수는 객체가 생성 시 전달받으며 속성이나 메소드의 자료형으로 사용됩니다.
 */
class SimpleGeneric<T> {
	private T[] values;
	private int index;

	SimpleGeneric(int len) {
		values = (T[]) new Object[len];	//Object를 T[]로 다운캐스팅!
		index = 0;
	}
	
	public void add(T... args) {	//T타입을 통해 args가 받을 수 있는 갯수에 제한은 없다! ex) 2개 받으면 for문 2개 돌린다.
		for (T e : args)			// 콜론의 역할 -> (왼 : 오) = 오른쪽의 덩어리?를 왼쪽에 하나씩 꺼내오는 것.
			values[index++] = e;	// index = 0에 ++해서 1을 넣어준다.
	}

	public void print() {
		for (T e : values)
			System.out.println(e + " ");
		System.out.println();
	}
}