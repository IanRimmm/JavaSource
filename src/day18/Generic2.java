/*
 Generics�� ����� �ڵ� (Complie ������ ������ üũ��)
 */
package day18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generic2 {
	
	public static void main(String[] args) {
		//����Ǵ� list�� Integer Ŭ���� Ÿ�Ը� ������ �� �ֽ��ϴ�.
		ArrayList<Integer> list = new ArrayList<Integer>(10);
		list.add(new Integer(10));
		
		//Error ���� �߻� �κ�, IntegerŸ�Ը� ����.
		//Design Time���� �߰ߵ˴ϴ�.
		list.add("List Test");
		
		Iterator i = list.iterator();
		Integer su = (Integer)i.next();
		System.out.println("su = " + su);
		
		su = (Integer)i.next();
		System.out.println("su = " + su);
	}
}