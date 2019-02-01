package day14;

import java.io.*;

public class ReadAndWriteFromFile {
	
	//����Ŭ����//�а���, �ٽ� �о�´�.
	public static void main(String[] args) {
		String fname = "aaa.txt";
		ReadAndWriteFromFile baw = new ReadAndWriteFromFile();
		try {
			baw.readnwrite(fname, true); // clear // true������ ������ �̾���Ѵ�!
			// baw.readnwrite("aaa.txt",true); // append
			baw.readFile(fname);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	//�б�
	public void readFile(String fn) throws IOException {
		FileReader fr = new FileReader(fn);
		BufferedReader br = new BufferedReader(fr);
		StringBuffer sb = new StringBuffer();
		String temp = "";
		while ((temp = br.readLine()) != null) {
			sb.append(temp + "\n");
		}
		System.out.println(sb.toString());
		br.close();
		fr.close();
	}
	
	//�а���, true�̸� append false�̸� overwrite
	public void readnwrite(String fn, boolean append) throws IOException {
		String s = null;
		FileWriter fw = new FileWriter(fn, append); // append true
		PrintWriter pw = new PrintWriter(fw); // flush false
		// PrintWriter pw = new PrintWriter(fw, true); // flush true
		while (!(s = readbuff()).equals("999")) {
			pw.println(s);
			pw.flush(); // PrintWriter(fw,true)�� ���� �ʿ����.
		}

		pw.close();
		fw.close();
	}
	
	//
	public String readbuff() throws IOException {	// readbuff Ű����� �Է��� ���� �������ִ� ���!
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
}