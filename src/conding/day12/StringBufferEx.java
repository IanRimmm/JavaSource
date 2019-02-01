package conding.day12;

public class StringBufferEx {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode());	//���� �� ��Ʈ������ �ؽ��� ���
		sb.append(" is pencil");	//���ڿ� �����̱�
		System.out.println(sb);
		sb.insert(7, " my"); //���ڿ� ����	//insert(7, " my")�� �ǹ̴� 7�� ° ���� " my"�� ����ְڴ�.
		System.out.println(sb);
		sb.replace(8, 10, "your");	//���ڿ� ��ġ	//replace(8,10,"your")�� �ǹ̴�  8,9�� ° ���� "your"�� ��ü�ϰڴ�.
		System.out.println(sb);
		sb.setLength(5);	//��Ʈ������ �� ���ڿ� ���� ����	//setLength(5)�� �ǹ̴� ���ڿ� ���̸� 5�� ����ڴ�.
		System.out.println(sb);
		System.out.println(sb.hashCode());	//���ڿ� ���� �� ��Ʈ�� ������ �ؽ� �ڵ�
											//���� ������ ���� ��ü���� ��Ÿ����.
	}
}

/*
1. StringBuffer��?
������ ���ڿ� ���뿡 �ʱ�ȭ�� ��Ʈ�� ���۸� �����Ѵ�.
���ڿ� ������ �ʱ� �뷮�� ���ڿ� �μ��� ���̿� 16�� ���� ���̴�.

2. StringBuffer�� ����ϴ� ����?
- �������� �������� Ŭ����(��ü)�� ������ �� method�� variable�� ���� �����Ǵµ�,
String�� ����ؼ� �����ȴٸ�, String�� �ּҰ��� stack������ ���̰�,
 Ŭ����(��ü)���� GC�� ȣ��Ǳ� ������ heap������ ���������� ���̰� �ȴ�.
 �̴� �޸� �������� ���鿡�� ġ�����̱� ������,
 StringBuffer�� ����ؼ� 1���� Ŭ����(��ü)�� �ð��� �޸𸮸� �����Ų��.
*/