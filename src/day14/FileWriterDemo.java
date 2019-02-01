package day14;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) {
		String source = "JAVA\n" + "JSP\n" + "EJB\n" + "OJT\n" + "가나다\n";
		String fname = "";

		// 저장할 파일명 입력
		// --------------------------------------------
		try {
			System.out.println("저장할 파일명을 입력하세요 : ");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine(); // 한 라인을 읽어 들임
		} catch (Exception e) {
			System.out.println("Error : " + e.toString());
		}
		// --------------------------------------------

		try {
			//파일 쓰기 객체 생성
			FileWriter fw = new FileWriter(fname);	//writer로 내보내는데, 앞에 File이 있으니까 목적지는 File! 즉 File로 내보내겠다는 이야기이다! :D
			fw.write(source); // 파일에 기록
			fw.close(); // 메모리 해제
			System.out.println("파일을 저장했습니다.");

			//파일을 읽어오는 객체 생성
			FileReader fr = new FileReader(fname);
//			BufferedReader inn = new BufferedReader(fr);
//			inn.readLine()
			int i;
			System.out.println("파일을 읽어옵니다.");

			//한 문자를 읽어 들임, 파일의 끝이라면 -1을 읽음
			while ((i = fr.read()) != -1) {
				System.out.print("(" + i + ")");	// ASCII코드로 나온다
				System.out.print((char) i);	// ASCII -> char 형변환
			}

			fr.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
