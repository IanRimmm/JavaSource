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
		 * File 파일관리 FileReader 파일읽기 FileWriter 파일저장
		 */

		try {
			FileReader fr = new FileReader(fileName);
			// fr.read();
			BufferedReader br = new BufferedReader(fr); // 한 줄로 다 읽어오고 싶기 때문에 BufferedReader를 쓴 것!

			FileWriter fw = new FileWriter(fileNameOutput, false);
			// fw.write(arg0);
			PrintWriter pw = new PrintWriter(fw);
			// fw.println은 쓸 수 없다. println을 쓰기 위해서 PrintWriter를 작성해준것!

			String line = "";

			pw.println("         2019년 신입사원 평가 점수                     ");
			pw.println("");
			pw.println("평가일 : " + new Date().toLocaleString());
			pw.println("-------------------------------------");
			pw.println(" 성 명  JAVA JSP SPRING PROJECT TOT AVG");
			pw.println("-------------------------------------");
			while (true) {
				line = br.readLine(); // 한 라인씩 읽어옴. //line을 안써줘도 되지만, if(readline == null)이면 줄이 꼬이게 된다.
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
