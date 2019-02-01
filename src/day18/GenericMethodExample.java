package day18;
/*
 [Generic �޼ҵ�]
 java���� ���ʸ� ���α׷��� �������� Ŭ������ �������̽�, �׸��� �޼ҵ尡 �ִ�!
 ���ʸ� Ŭ����, ���ʸ� �������̽��� �ٸ� ����? **return�� �ٷ� �տ� ��ġ�Ѵ�!
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
	
	// Generic �޼ҵ� ��ġ �߿�! return �� �ٷ� �տ� ��ġ!
	public static <T> void printArgInfo(T arg) {
		System.out.println("Argument Type is " + arg.getClass());
		System.out.println(" / Value is " + arg.toString());
	}
}
/*
 [Generic] ��X, �ܼ� ���
 E - Element
 K - Key
 N - Number
 T - Type
 V - Value
 */
