package day15;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	
	public static void main(String[] args) {
		HashSet list = new HashSet();
		
		list.add("lee"); //0
		list.clear(); //��� ����
		list.add("cho"); //0
		list.add("kim"); //1
		list.add("chung"); //2
		list.add("min"); //3
		list.add("chung"); //2�� ����
		
		System.out.println("set ������: " + list.size()); //size()
		System.out.println(list.contains("chung"));
		
		list.remove("kim"); //1����
		
		System.out.println("kim ���� �� set ������ : " + list.size());
		System.out.println("Iterator��ü �̿��ؼ� set���");
		print(list.iterator());
	}
	
	public static void print(Iterator iter) {
		while(iter.hasNext()) {
			String str = (String)iter.next();
			System.out.println(str);
		}
	}//
	
	public static void print(Object[] obj) {
		int count = obj.length;
		for(int i=0;i<count;i++) {
			System.out.println(obj[i]);
		}
	}//
}
