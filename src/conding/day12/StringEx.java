package conding.day12;

public class StringEx {

	public static void main(String[] args) {
		String a = new String(" abcd");	//String�� �Һ��̴�.
		String b = new String(",efg");
//		System.out.println(a.hashCode());
		//���ڿ� ����
		a = a.concat(b);
		System.out.println(a);
//		System.out.println(a.hashCode());
		//���� ����
		a = a.trim();
		System.out.println(a);
//		System.out.println(a.hashCode());
		//���ڿ� ��ġ
		a = a.replace("ab", "12");
		System.out.println(a);
//		System.out.println(a.hashCode());	hashcode���� ��� �ٲ�� ���� Ȯ���ϱ� ����.
		//���ڿ� �и�
		String s[] = a.split(",");
		for(int i=0;i<s.length;i++)
			System.out.println("�и���" + i + "�� ���ڿ�:" +s[i]);
		
		//���� ��Ʈ��
		a = a.substring(3);
		System.out.println(a);
		
		//���ڿ��� ����
		char c = a.charAt(2);
		System.out.println(c);
		}

}