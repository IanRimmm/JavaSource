//set -> toArray(); �ε�������
//map -> iterator�� ����

//list, vertor�� ���� �ִ�.
//properties -> key-value 1.key,value ��� StringŸ��, 2.���Ϸ� �ҷ����� ����.

package day15;

import java.io.FileInputStream;
import java.util.*;

public class ProTest2 {
	
	public static void main(String[] args) {
		String myinfoPath = "myinfo.properties";
		
		FileInputStream fis = null;
		
		Properties pro = new Properties();
		try {
			fis = new FileInputStream(myinfoPath);
			
			pro.load(fis);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Iterator iter = pro.keySet().iterator();
		
//		while(iter.hasNext()) {
//			String key = (String)iter.next();
//			String value = (String)pro.getProperty(key);
//			System.out.println(key + " = " + value);
		
//			�� �ٷ� System.out.println(pro.getProperty(key));�� �ٲ��� �� �ִ�.
//		}
		
		System.out.println("�̸� : "+pro.getProperty("name"));
		System.out.println("��ȭ��ȣ : "+pro.getProperty("phone"));
		System.out.println("�ּ� : "+pro.getProperty("address"));
	}
}
