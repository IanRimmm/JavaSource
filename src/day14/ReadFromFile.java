package day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFromFile {
	
	public static void main(String[] args) {
		String fname = "src\\day14\\ReadFromFile.java";
		
		File f = new File(fname);
		String path = f.getAbsolutePath();
		System.out.println(path);	// 여까지 딱 작성한 것! D:\machine\java\workspace\javatest\src\package명\ReadFromFile.java
		
		
		try {
			FileReader fr = new FileReader(f);	// 목적지는 f가 가리키는 그곳을 읽어온다.
			BufferedReader br = new BufferedReader(fr); // BufferedReader에 감싸서 한 번 더 생성했다. FileReader는 한 자씩 읽어오기 때문에, 한 줄 씩 읽어올 수 있는 BufferedReader를 사용!
			StringBuffer sb = new StringBuffer();
			String s = "";
			while((s=br.readLine()) != null) {	// != (o), ! = (x) // (s=br.readLine()) 위의 import 세 줄을 한 줄씩, 읽어와서 s에 여기서는 string에 넣겠다!
				sb.append(s + "\n");
			}
			
			s=sb.toString();
			System.out.println(s);
			br.close();
			fr.close();
		}catch(Exception ee) {
			System.out.println(ee.toString());
		}
	}
}
