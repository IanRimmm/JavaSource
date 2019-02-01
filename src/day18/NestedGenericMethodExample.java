package day18;

public class NestedGenericMethodExample {

	public static void main(String[] args) {
		GenericClass1<String> gc = new GenericClass1<String>();

		gc.printGenericMethodArgInfo(10L);
		gc.printGenericMethodArgInfo('A');
		// gc.printMethodArgInfo(10L); //10L��� "10L"�� ������ ���� �� ����!
	}
}
/*
 ������ Generic���������� ��������� �����ؼ� �޼ҵ� ������ Type�� �����س���, �ùٸ� Ÿ���� ������ ��Ī���Ѽ� ����.
 ������, �̹��� Generic Method������ Ÿ���� ���� ������ ���� �ʰ�, �׸��� ����� ���ٰ� �����ϸ� �ȴ�!
 �׷��� gc.printGenericMethodArgInfo(10L);���� Ÿ�Ե� �������ְ�, ���ڰ��� �Ѱ��ִ� ������ �����ϸ� �ȴ�!
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