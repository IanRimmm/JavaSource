	/*
	 [Map]
	 - key, value 한 쌍
	 - HashMap, Hashtable
	 - put 메서드로 입력합니다.
	 - 중복된 키 값을 허용하지 않습니다. 만약 사용하게 되면 기존의 값이 삭제된다.
	 - 검색 결과가 없으면 null을 리턴한다.
	 */
package day15;

import java.util.*;

public class MapTest {
	
	public static void main(String[] args) {
		/*
		 1. key -> value 느낌!
		 2. add => 배열
		 	put => map 느낌!
		*/
		HashMap list = new HashMap();
		list.put("o", "lee");
		list.clear(); //모두 제거
		list.put("1", "cho");
		list.put("2", "kim");
		list.put("3", "chung");
		list.put("4", "min");
		list.put("3", "jung");
		System.out.println(list.size()); //size()
		System.out.println(list.containsKey("3"));
		list.remove("2");
		System.out.println(list.size()); 
		
		print(list); //set 만들기
		
		/*
		 
		 */
	}
	
	public static void print(Map sets) {
		Set set = sets.keySet(); //key값을 Set으로 //key도 set도 중복된 내용을 저장할 수 없으므로, key를 set으로 변환하는게 가능!
		Iterator iter = set.iterator(); // Iterator안에 key값만 들어간다. // keyset은 만들어 놨던 list의 키값들을 반환해주는 것.
		while(iter.hasNext()) {
			String key = (String)iter.next();
			System.out.println(key + " " + sets.get(key)); //value
		}
	}//
}
