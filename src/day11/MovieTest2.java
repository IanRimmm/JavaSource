package day11;

public class MovieTest2 {

	public static void main(String[] args) {
		// �⺻ �����ڴ� �ڵ����� �����Ǿ� ���˴ϴ�.
		Action2 act = new Action2();
		act.name = "���ĵ�";
		System.out.println(act.name);
	}
}

class TV2 {
	public TV2() {
		super();	//ù ���ο��� �θ��� �����ڸ� ȣ���ϴ� ���� ����ִ�.
		System.out.println("TV2");
	}
}

class Movie2 extends TV2 {	//ex) TV��� ���� ��, ��� ���谡 �ƴϹǷ�, Movie2������ ��µ�!
	String part = "�ѱ� ��ȭ";

	public Movie2() {
		System.out.println("Movie2");
	}
}

class Action2 extends Movie2 {
	String name = "";

	public Action2() {
		System.out.println("Action2");
	}
}