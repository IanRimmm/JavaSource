package day15;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class TestHashTable {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		
		ht.put("AREA01", "대한민국");
		ht.put("AREA02", "러시아");
		ht.put("AREA03", "중국");
		ht.put("AREA04", "일본");
		
		String area = (String)ht.get("AREA01");
		//String area (String)ht.get("AREA05");
		
		if( area != null) {
			System.out.println(area);
		}else {
			System.out.println("검색 지역이 없습니다.");
		}
		
		printI(ht);
		printM(ht);
	}
	
	private static void printI(Map map) {
		Iterator iterator = map.keySet().iterator();
		while(iterator.hasNext()	) {
			String key = (String)iterator.next();
			System.out.println(key +" "+map.get(key));
		}
	}
	
	private static void printM(Hashtable map) { //map이 아닌 Hashtable로 받아야한다.
		Enumeration e = map.keys();	// map.keys(); -> Enmueration e = map.keys();로 작성하도록 한다!
		while(e.hasMoreElements()) {
			String key = (String)e.nextElement();
			System.out.println(key +" "+map.get(key));
		}
	}

}
