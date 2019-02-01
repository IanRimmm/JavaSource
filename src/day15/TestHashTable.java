package day15;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class TestHashTable {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		
		ht.put("AREA01", "���ѹα�");
		ht.put("AREA02", "���þ�");
		ht.put("AREA03", "�߱�");
		ht.put("AREA04", "�Ϻ�");
		
		String area = (String)ht.get("AREA01");
		//String area (String)ht.get("AREA05");
		
		if( area != null) {
			System.out.println(area);
		}else {
			System.out.println("�˻� ������ �����ϴ�.");
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
	
	private static void printM(Hashtable map) { //map�� �ƴ� Hashtable�� �޾ƾ��Ѵ�.
		Enumeration e = map.keys();	// map.keys(); -> Enmueration e = map.keys();�� �ۼ��ϵ��� �Ѵ�!
		while(e.hasMoreElements()) {
			String key = (String)e.nextElement();
			System.out.println(key +" "+map.get(key));
		}
	}

}
