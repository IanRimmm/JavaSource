	/*
	 [Map]
	 - key, value �� ��
	 - HashMap, Hashtable
	 - put �޼���� �Է��մϴ�.
	 - �ߺ��� Ű ���� ������� �ʽ��ϴ�. ���� ����ϰ� �Ǹ� ������ ���� �����ȴ�.
	 - �˻� ����� ������ null�� �����Ѵ�.
	 */
package day15;

import java.util.*;

public class MapTest {
	
	public static void main(String[] args) {
		/*
		 1. key -> value ����!
		 2. add => �迭
		 	put => map ����!
		*/
		HashMap list = new HashMap();
		list.put("o", "lee");
		list.clear(); //��� ����
		list.put("1", "cho");
		list.put("2", "kim");
		list.put("3", "chung");
		list.put("4", "min");
		list.put("3", "jung");
		System.out.println(list.size()); //size()
		System.out.println(list.containsKey("3"));
		list.remove("2");
		System.out.println(list.size()); 
		
		print(list); //set �����
		
		/*
		 
		 */
	}
	
	public static void print(Map sets) {
		Set set = sets.keySet(); //key���� Set���� //key�� set�� �ߺ��� ������ ������ �� �����Ƿ�, key�� set���� ��ȯ�ϴ°� ����!
		Iterator iter = set.iterator(); // Iterator�ȿ� key���� ����. // keyset�� ����� ���� list�� Ű������ ��ȯ���ִ� ��.
		while(iter.hasNext()) {
			String key = (String)iter.next();
			System.out.println(key + " " + sets.get(key)); //value
		}
	}//
}
