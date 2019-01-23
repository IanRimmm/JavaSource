package day10;

public class TypeConverTest {
	public static void main(String[] args) {
		TypeConvert tc = new TypeConvert();
		Object obj = tc; // Object Ŭ������ �޼ҵ常 ȣ�Ⱑ��, ��ĳ����.
		
//		Object obj1 = new TypeConvert();	//��ĳ����, ������ obj �� ��. ���� �� ���� tc�� obj �� ��.
		
		System.out.println(obj.toString());	//toString�� Object�� ���ε�, Ÿ���� TypeConver�̴�. ����� : day10.TypeConvert@7852e922
		System.out.println(tc.getUrl());

		System.out.println(obj.hashCode());
		System.out.println(tc.hashCode());

		TypeConvert tc2 = (TypeConvert) obj; //�ٿ�ĳ����
		System.out.println("tc2: " + tc2.getUrl());
		System.out.println("tc2: " + tc2.hashCode());
	}
}

class TypeConvert { // ��� Ŭ������ extends Object�� �����Ǿ� �ִ�.
	String url = "http://www.kma.go.kr";

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�������̵��� �ڽ��� toString() �޼ҵ�";	//syso(obj.toString());���� Ÿ�Կ��� �����ϴٰ�(���⼱ �ؽ��ڵ尪), �������̵��Ǹ� ���� ��µȴ�.
	}
	
}