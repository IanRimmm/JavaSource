package day14;

import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class ReadFromLine {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("����Ÿ�� �Է��ϼ���");
			InputStreamReader isr = new InputStreamReader(System.in);	// InputStreamŸ���� ReaderŸ������ ��ȯ�����ִ� ��!
			LineNumberReader br = new LineNumberReader(isr);			// LineNumber�� ReaderŸ���̹Ƿ� �����ֱ�����!
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
