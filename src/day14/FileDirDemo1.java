package day14;

import java.io.*;

public class FileDirDemo1 {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader�� readLine�̶�� �޼ҵ带 ���� �ִ�! readLine�� �о���� �ϱ� ����, ���� �о���� ���ؼ� BufferedReader�� ���� �Դ�!
		System.out.println("���丮�� �Է����ּ���.");

		String directory = "";
		try {
			directory = in.readLine();
		} catch (Exception e) {
			System.out.println("Error : " + e.toString());
		}

		File f1 = new File(directory);

		if (f1.isDirectory()) {
			System.out.println("�˻� ���丮 " + directory);
			System.out.println("=========================");
			String s[] = f1.list();

			for (int i = 0; i < s.length; i++) {
				File f = new File(directory + "/" + s[i]);

				if (f.isDirectory()) {
					System.out.println(s[i] + " : ���丮");
				} else {
					System.out.println(s[i] + " : ����");
				}
			}
		} else {
			System.out.println("������ " + directory + " �� ���丮�� �ƴ�");
		}

	}
}
