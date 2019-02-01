package day16;

import java.util.*;

public class HashtableEx {
	
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put("21", "ȫ�浿");	// ~.put(Object, Object);
		h.put("54", "Ȳ����");
		h.put("76", "�̼ҷ�");
		h.put("123", "�ظ�������");
		System.out.println("Hashtable�� Ű ���� : " + h.size()); //Ű��  ����
		
		Enumeration e = h.keys(); //Hashtable�� ��� Ű������ Enumeration(Ȥ�� Iterator���·�) ������ //public Enumeration<K> keys() Returns an enumeration of the keys in this hashtable.
		//keySet()�� �����ѵ� Set�� ���·� �޾ƿ��Ƿ�, ������ ��� Iterator�� �ݺ� �ۼ������ �Ѵ�.
		while(e.hasMoreElements()) { //e.hasMoreElements�� ��� 1�� �̻��� ��Ҹ� ���� �ִٸ� true�� ��ȯ.
			String key = (String)e.nextElement(); //Ű //downcating : Object -> String
//			System.out.println(e.nextElement());
			String value = (String)h.get(key); //Ű�� ���ε� �� //downcating : Object -> String
			System.out.println(key + ":" + value);
		}
	}
}