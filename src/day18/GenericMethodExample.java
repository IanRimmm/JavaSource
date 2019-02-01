package day18;
/*
 [Generic 메소드]
 java에서 제너릭 프로그램의 단위에는 클래스와 인터페이스, 그리고 메소드가 있다!
 제너릭 클래스, 제너릭 인터페이스와 다른 점은? **return값 바로 앞에 위치한다!
 */
public class GenericMethodExample {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		char c = 'A';
		float f = 3.14f;
		
		printArgInfo(i);	// <Integer> void printArgInfor(Integer)
		printArgInfo(c);	// <Character> void printArgInfo(Character)
		printArgInfo(f);	// <Float> void printArgInfo(Float)
	}
	
	// Generic 메소드 위치 중요! return 값 바로 앞에 위치!
	public static <T> void printArgInfo(T arg) {
		System.out.println("Argument Type is " + arg.getClass());
		System.out.println(" / Value is " + arg.toString());
	}
}
/*
 [Generic] 법X, 단순 약속
 E - Element
 K - Key
 N - Number
 T - Type
 V - Value
 */
