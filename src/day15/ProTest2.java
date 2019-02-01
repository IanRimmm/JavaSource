//set -> toArray(); 인덱스접근
//map -> iterator로 접근

//list, vertor는 순서 있다.
//properties -> key-value 1.key,value 모두 String타입, 2.파일로 불러오기 가능.

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
		
//			한 줄로 System.out.println(pro.getProperty(key));로 바꿔줄 수 있다.
//		}
		
		System.out.println("이름 : "+pro.getProperty("name"));
		System.out.println("전화번호 : "+pro.getProperty("phone"));
		System.out.println("주소 : "+pro.getProperty("address"));
	}
}
