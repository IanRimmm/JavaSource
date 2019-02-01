package day18;

import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.List; 

public class Generic {
	
	public static void main(String[] args) {
		//ArrayList ��ü 10���� ������ �� �ִ� list ��ü ���� ����
		ArrayList list = new ArrayList(10);
		
		list.add(new Integer(10)); //Integer �߰�
		list.add("List Test"); //String �߰�
		
		//��ü �迭���� ���������� ��ü�� �����ϱ� ���� Iterator ��ü ����
		Iterator i = list.iterator();
		
		Integer su = (Integer)i.next();
		System.out.println("su = " + su);
		
		su = (Integer)i.next();	//Error�߻�	//�׳� �����ָ� �ȴ�. �� �� �����ϱ�.
		System.out.println("su = " + su);
		
		/*
		 	�������� ��Ÿ��
		 	Integer su;
		 	while (i.hasNext()) {
			su = (Integer) i.next();
			System.out.println("su = " + su);
			}
		*/
	}
}
