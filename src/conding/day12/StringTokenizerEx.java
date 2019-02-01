package conding.day12;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����","/");	//�����ڷ� '/'�� ���
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
/*
1. StringTokenizer�̶�?
 ������ ���ڿ��� ���� ���ڿ� ������ ��ũ�������� �����Ѵ�.
 ���б�ȣ ��ü�� ��ū���� ó������ ������,
 ������ StringTokenizer���� �ٸ� �޼ҵ带 ȣ���Ϸ��� �ϸ�  NullPointerException�� �߻��� �� �ִ�.
 
 "/" ���� �����ڰ� �ִٸ�, �����ڸ� �������� ������ȭ�� �� �ִ�

2. .hasMoreTokens�̶�?
�� ��ū ���ڿ����� ��� ������ ��ū�� �� �ִ��� ���θ� �׽�Ʈ�Ѵ�. 
�� �޼ҵ尡 true���� �����ָ�, �μ�(argument)�� �������� �ʰ� nextToken�� ȣ���ϸ�
���������� ��ū�� �����־�����.

*/