package day14;

import java.io.*;

public class ReadAndWriteFromFile {
	
	//메인클래스//읽고쓰고, 다시 읽어온다.
	public static void main(String[] args) {
		String fname = "aaa.txt";
		ReadAndWriteFromFile baw = new ReadAndWriteFromFile();
		try {
			baw.readnwrite(fname, true); // clear // true값으로 받으면 이어쓰기한다!
			// baw.readnwrite("aaa.txt",true); // append
			baw.readFile(fname);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	//읽기
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
	
	//읽고쓰고, true이면 append false이면 overwrite
	public void readnwrite(String fn, boolean append) throws IOException {
		String s = null;
		FileWriter fw = new FileWriter(fn, append); // append true
		PrintWriter pw = new PrintWriter(fw); // flush false
		// PrintWriter pw = new PrintWriter(fw, true); // flush true
		while (!(s = readbuff()).equals("999")) {
			pw.println(s);
			pw.flush(); // PrintWriter(fw,true)일 때는 필요없다.
		}

		pw.close();
		fw.close();
	}
	
	//
	public String readbuff() throws IOException {	// readbuff 키보드로 입력한 값을 리턴해주는 기능!
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}
}