package day14;

import java.io.*;

public class FileDirDemo1 {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader는 readLine이라는 메소드를 갖고 있다! readLine을 읽어오게 하기 위해, 쉽게 읽어오기 위해서 BufferedReader를 갖고 왔다!
		System.out.println("디렉토리를 입력해주세요.");

		String directory = "";
		try {
			directory = in.readLine();
		} catch (Exception e) {
			System.out.println("Error : " + e.toString());
		}

		File f1 = new File(directory);

		if (f1.isDirectory()) {
			System.out.println("검색 디렉토리 " + directory);
			System.out.println("=========================");
			String s[] = f1.list();

			for (int i = 0; i < s.length; i++) {
				File f = new File(directory + "/" + s[i]);

				if (f.isDirectory()) {
					System.out.println(s[i] + " : 디렉토리");
				} else {
					System.out.println(s[i] + " : 파일");
				}
			}
		} else {
			System.out.println("지정한 " + directory + " 는 디렉토리가 아님");
		}

	}
}
