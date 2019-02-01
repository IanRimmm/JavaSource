package coding.day15;

import java.io.FileWriter;
import java.io.PrintWriter;

public class DevWriter {
	
	public static void main(String[] args) {
		String fileName = "dev.txt";
		
		try {
			FileWriter fw = new FileWriter(fileName, false);
			//false는 덮어쓰기, true는 이어쓰기. 없으면 디폴트값은 false!
			PrintWriter pw = new PrintWriter(fw);
			//println을 쓰기 위해서 PrintWriter를 써주는 것!
			
			pw.println("왕눈이,90,95,60,75");
			pw.println("아로미,100,90,65,90");
			pw.println("가길동,90,100,80,85");
			pw.println("나길동,60,80,85,95");
			pw.println("홍길동,90,95,75,100");
			
			pw.flush();	//close함수가 내부적으로 flush함수를 호출하기 때문에, 안 써도 괜찮다!
			pw.close();
			fw.close();
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
