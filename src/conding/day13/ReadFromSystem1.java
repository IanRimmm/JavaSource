package conding.day13;

/*
 - System.in.read()�� �̿��մϴ�.
 - ���ڸ� ������ �޾� ���ڿ��� ����� ���� ����.
 - new String(byte �迭,����,��-2); \n, \r�� �پ��־ ��
 */
public class ReadFromSystem1 {

	public static void main(String[] args) {

		byte[] b = new byte[1024];
		int len = 0;
		try {
			System.out.println("����Ÿ�� �Է��ϼ���.");
			len = System.in.read(b); // ���� 102 //read�� �ϰԵǸ� �� �� �Է��ߴ����� len���� ���ְڴ�?��
			System.out.println(len);
		} catch (Exception e) {
			System.out.println("�Է½���");
		}
		String str = new String(b, 0, len - 2);
		System.out.println(str);
		try {
			System.out.println("����Ÿ�� �Է��ϼ���.");
			len = System.in.read(b);
			System.out.write(b, 0, len);
			System.in.close();
		} catch (Exception e) {
			System.out.println("�Է½���");
		}
	}
}