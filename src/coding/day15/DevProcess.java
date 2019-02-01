package coding.day15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class DevProcess {

	public static void main(String[] args) {
		String fileName = "dev.txt";
		String fileNameOutput = "dev_output.txt";

		/*
		 * File ���ϰ��� FileReader �����б� FileWriter ��������
		 */

		try {
			FileReader fr = new FileReader(fileName);
			// fr.read();
			BufferedReader br = new BufferedReader(fr); // �� �ٷ� �� �о���� �ͱ� ������ BufferedReader�� �� ��!

			FileWriter fw = new FileWriter(fileNameOutput, false);
			// fw.write(arg0);
			PrintWriter pw = new PrintWriter(fw);
			// fw.println�� �� �� ����. println�� ���� ���ؼ� PrintWriter�� �ۼ����ذ�!

			String line = "";

			pw.println("         2019�� ���Ի�� �� ����                     ");
			pw.println("");
			pw.println("���� : " + new Date().toLocaleString());
			pw.println("-------------------------------------");
			pw.println(" �� ��  JAVA JSP SPRING PROJECT TOT AVG");
			pw.println("-------------------------------------");
			while (true) {
				line = br.readLine(); // �� ���ξ� �о��. //line�� �Ƚ��൵ ������, if(readline == null)�̸� ���� ���̰� �ȴ�.
				if (line == null) {
					break;
				}
				String[] str = line.split(",");
				System.out.println(str[0]);
				System.out.println(str[1]);
				System.out.println(str[2]);
				System.out.println(str[3]);
				System.out.println(str[4]);
				String name = str[0];
				int java = Integer.parseInt(str[1]);
				int jsp = Integer.parseInt(str[2]);
				int spring = Integer.parseInt(str[3]);
				int project = Integer.parseInt(str[4]);

				int tot = java + jsp + spring + project;
				int avg = tot / 4;
				pw.println(name + "   " + java + "   " + jsp + "   " + spring + "    " + project + "    " + tot + "    " + avg);
				pw.println("-------------------------------------");
			}
			pw.println("	SOLDESK IT Academy 2019		");

			br.close();
			fr.close();

			pw.flush();
			pw.close();
			fw.close();
		} catch (Exception e) {

		}
	}
}
