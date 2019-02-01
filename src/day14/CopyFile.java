package day14;

import java.io.*;

public class CopyFile {

	public static void main(String[] args) {
		try {
			// File 객체를 프로그램 실행시의 인자를 이용하여 생성한다.
			// 예를 들어, java CopyFile test.txt output.txt
			// test.txt -> args[0]
			// output.txt -> args[1]

			// 파라미터를 2개 받았는지 검사
			if (args.length != 2) {
				System.out.println("-----------에러 발생-----------");
				System.out.println("usage : java CopyFile <원본파일명> <대상파일명>");

				// 비정상적인 종료:0보다 큰 값을 지정
				System.exit(1);	// 비정상적인 종료를 할 때 1을 넣어준다!
				;
			}
			
			// File 객체 생성
			File inputFile = new File(args[0]);
			File outputFile = new File(args[1]);

			FileReader in = new FileReader(inputFile);
			FileWriter out = new FileWriter(outputFile);

			int c;

			/*
			 * FileReader 클래스 객체에서 파일의 끝까지 읽어서 FileWirter 클래스에 기록을 합니다. 한 문자를 읽어들임, 문자는
			 * 내부적으로 문자코드에 기반한 숫자형태로 변경되어 처리됩니다. EOF -1
			 */
			while ((c = in.read()) != -1) {
				// 파일에 출력
				out.write(c);
			}

			System.out.println("파일 복사가 완료되었습니다.");
			// 스트림을 닫아줍니다.
			in.close();
			out.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}