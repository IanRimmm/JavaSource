package day18;
/*
 [Generic 인터페이스]
 클래스와 마찬가지로 형 매개변수를 가지는 제너릭 인터페이스를 선언한다!
 */
public class GenericInterfaceExample {

	public static void main(String[] args) {
		GenericClass<Integer> gInteger = new GenericClass<Integer>();
		GenericClass<String> gString = new GenericClass<String>();

		gInteger.setValue(10);
		gString.setValue("Text");
		System.out.println(gInteger.getValueType());
		System.out.println(gString.getValueType());
	}
}

interface GenericInterface<T> {
	public void setValue(T x);
	
	public String getValueType();
}

class GenericClass<T> implements GenericInterface<T> {
	private T value;
	
	@Override	//오버라이딩 된 것을 알도록!
	public void setValue(T x) {
		value = x;
	}
	
	@Override
	public String getValueType() {
		return value.getClass().toString();
	}
}