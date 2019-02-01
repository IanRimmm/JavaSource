package day18;

public class NestedGenericMethodExample {

	public static void main(String[] args) {
		GenericClass1<String> gc = new GenericClass1<String>();

		gc.printGenericMethodArgInfo(10L);
		gc.printGenericMethodArgInfo('A');
		// gc.printMethodArgInfo(10L); //10L대신 "10L"만 넣으면 에러 안 난다!
	}
}
/*
 이전의 Generic예제에서는 멤버변수를 설정해서 메소드 내에서 Type을 설정해놓고, 올바른 타입의 변수만 매칭시켜서 들어갔다.
 하지만, 이번의 Generic Method에서는 타입을 따로 설정해 주지 않고, 그릇만 만들어 놨다고 생각하면 된다!
 그래서 gc.printGenericMethodArgInfo(10L);에서 타입도 설정해주고, 인자값을 넘겨주는 것으로 생각하면 된다!
 */
class GenericClass1<T> {
	
	public void printMethodArgInfor(T arg) {
		System.out.println("Argument Type is " + arg.getClass());
		System.out.println(" / Value is " + arg.toString());
	}

	public <T> void printGenericMethodArgInfo(T arg) {
		System.out.println("Argument Type is " + arg.getClass());
		System.out.println(" / Value is " + arg.toString());
	}
}