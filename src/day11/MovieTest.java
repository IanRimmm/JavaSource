package day11;

public class MovieTest {
	
	public static void main(String[] args) {
		//�⺻ �����ڴ� �ڵ����� �����Ǿ� ���˴ϴ�.
		Action act = new Action();
		act.name = "���ĵ�";	//�̹���
		System.out.println(act.name);
	}
}

class TV{
	
}
class Movie extends TV{
	String part = "�ѱ� ��ȭ";
}

class Action extends Movie{
	String name="";
}

//��� ������ �ȿ��� �θ��� �⺻�����ڸ� ȣ���ϴ� �ڵ尡 �� �ִ�!