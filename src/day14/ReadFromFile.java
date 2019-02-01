package day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFromFile {
	
	public static void main(String[] args) {
		String fname = "src\\day14\\ReadFromFile.java";
		
		File f = new File(fname);
		String path = f.getAbsolutePath();
		System.out.println(path);	// ������ �� �ۼ��� ��! D:\machine\java\workspace\javatest\src\package��\ReadFromFile.java
		
		
		try {
			FileReader fr = new FileReader(f);	// �������� f�� ����Ű�� �װ��� �о�´�.
			BufferedReader br = new BufferedReader(fr); // BufferedReader�� ���μ� �� �� �� �����ߴ�. FileReader�� �� �ھ� �о���� ������, �� �� �� �о�� �� �ִ� BufferedReader�� ���!
			StringBuffer sb = new StringBuffer();
			String s = "";
			while((s=br.readLine()) != null) {	// != (o), ! = (x) // (s=br.readLine()) ���� import �� ���� �� �پ�, �о�ͼ� s�� ���⼭�� string�� �ְڴ�!
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
