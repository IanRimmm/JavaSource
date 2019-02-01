package day14;

import java.io.*;

public class CopyFile {

	public static void main(String[] args) {
		try {
			// File ��ü�� ���α׷� ������� ���ڸ� �̿��Ͽ� �����Ѵ�.
			// ���� ���, java CopyFile test.txt output.txt
			// test.txt -> args[0]
			// output.txt -> args[1]

			// �Ķ���͸� 2�� �޾Ҵ��� �˻�
			if (args.length != 2) {
				System.out.println("-----------���� �߻�-----------");
				System.out.println("usage : java CopyFile <�������ϸ�> <������ϸ�>");

				// ���������� ����:0���� ū ���� ����
				System.exit(1);	// ���������� ���Ḧ �� �� 1�� �־��ش�!
				;
			}
			
			// File ��ü ����
			File inputFile = new File(args[0]);
			File outputFile = new File(args[1]);

			FileReader in = new FileReader(inputFile);
			FileWriter out = new FileWriter(outputFile);

			int c;

			/*
			 * FileReader Ŭ���� ��ü���� ������ ������ �о FileWirter Ŭ������ ����� �մϴ�. �� ���ڸ� �о����, ���ڴ�
			 * ���������� �����ڵ忡 ����� �������·� ����Ǿ� ó���˴ϴ�. EOF -1
			 */
			while ((c = in.read()) != -1) {
				// ���Ͽ� ���
				out.write(c);
			}

			System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ�.");
			// ��Ʈ���� �ݾ��ݴϴ�.
			in.close();
			out.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}