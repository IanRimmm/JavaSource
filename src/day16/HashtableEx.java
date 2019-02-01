package day16;

import java.util.*;

public class HashtableEx {
	
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put("21", "홍길동");	// ~.put(Object, Object);
		h.put("54", "황기태");
		h.put("76", "이소룡");
		h.put("123", "해리슨포드");
		System.out.println("Hashtable의 키 개수 : " + h.size()); //키의  개수
		
		Enumeration e = h.keys(); //Hashtable의 모든 키값들을 Enumeration(혹은 Iterator형태로) 가져옴 //public Enumeration<K> keys() Returns an enumeration of the keys in this hashtable.
		//keySet()도 가능한데 Set의 형태로 받아오므로, 순서가 없어서 Iterator로 반복 작성해줘야 한다.
		while(e.hasMoreElements()) { //e.hasMoreElements는 적어도 1개 이상의 요소를 갖고 있다면 true를 반환.
			String key = (String)e.nextElement(); //키 //downcating : Object -> String
//			System.out.println(e.nextElement());
			String value = (String)h.get(key); //키에 매핑된 값 //downcating : Object -> String
			System.out.println(key + ":" + value);
		}
	}
}