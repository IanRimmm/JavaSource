package coding.day15;

import java.io.BufferedReader;
import java.io.FileReader;

public class DevReader {
	
	public static void main(String[] args) {
		String fileName = "dev_output.txt";
		
		try {
			FileReader fr = new FileReader(fileName); // ���� �б� ����
			BufferedReader br = new BufferedReader(fr); //�޸𸮿� ���� ���� ����
			
			String str = "";
			String line = "";
			
			while(true) {
				line = br.readLine(); //�� ���ξ� ����
				
				if(line == null) { //������ ���������� ���� ���
					break;
				}
				
				System.out.println(line); //���ڿ� �߰�, \n ���� ����
			}
			
			br.close(); //�޸� ����
			fr.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}