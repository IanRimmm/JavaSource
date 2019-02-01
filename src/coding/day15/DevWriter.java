package coding.day15;

import java.io.FileWriter;
import java.io.PrintWriter;

public class DevWriter {
	
	public static void main(String[] args) {
		String fileName = "dev.txt";
		
		try {
			FileWriter fw = new FileWriter(fileName, false);
			//false�� �����, true�� �̾��. ������ ����Ʈ���� false!
			PrintWriter pw = new PrintWriter(fw);
			//println�� ���� ���ؼ� PrintWriter�� ���ִ� ��!
			
			pw.println("�մ���,90,95,60,75");
			pw.println("�Ʒι�,100,90,65,90");
			pw.println("���浿,90,100,80,85");
			pw.println("���浿,60,80,85,95");
			pw.println("ȫ�浿,90,95,75,100");
			
			pw.flush();	//close�Լ��� ���������� flush�Լ��� ȣ���ϱ� ������, �� �ᵵ ������!
			pw.close();
			fw.close();
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
