package day14;

import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class ReadFromLine {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("데이타를 입력하세요");
			InputStreamReader isr = new InputStreamReader(System.in);	// InputStream타입을 Reader타입으로 변환시켜주는 것!
			LineNumberReader br = new LineNumberReader(isr);			// LineNumber가 Reader타입이므로 맞춰주기위해!
			StringBuffer sb = new StringBuffer();
			String s = "";
			while(!(s=br.readLine()).equals("999")) {
				sb.append(br.getLineNumber()+" "+s+"\n");
			}
			System.out.println(sb.toString());
			br.close();
			isr.close();
		}catch(Exception ee) {
			System.out.println(ee.toString());
		}
	}
}
