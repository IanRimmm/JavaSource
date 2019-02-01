package day14;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) {
		String source = "JAVA\n" + "JSP\n" + "EJB\n" + "OJT\n" + "������\n";
		String fname = "";

		// ������ ���ϸ� �Է�
		// --------------------------------------------
		try {
			System.out.println("������ ���ϸ��� �Է��ϼ��� : ");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine(); // �� ������ �о� ����
		} catch (Exception e) {
			System.out.println("Error : " + e.toString());
		}
		// --------------------------------------------

		try {
			//���� ���� ��ü ����
			FileWriter fw = new FileWriter(fname);	//writer�� �������µ�, �տ� File�� �����ϱ� �������� File! �� File�� �������ڴٴ� �̾߱��̴�! :D
			fw.write(source); // ���Ͽ� ���
			fw.close(); // �޸� ����
			System.out.println("������ �����߽��ϴ�.");

			//������ �о���� ��ü ����
			FileReader fr = new FileReader(fname);
//			BufferedReader inn = new BufferedReader(fr);
//			inn.readLine()
			int i;
			System.out.println("������ �о�ɴϴ�.");

			//�� ���ڸ� �о� ����, ������ ���̶�� -1�� ����
			while ((i = fr.read()) != -1) {
				System.out.print("(" + i + ")");	// ASCII�ڵ�� ���´�
				System.out.print((char) i);	// ASCII -> char ����ȯ
			}

			fr.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
