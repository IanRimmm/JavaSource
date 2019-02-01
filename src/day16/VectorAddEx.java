package day16;

import java.util.Vector;

public class VectorAddEx {
	
	public static void main(String[] args) {
		Vector v = new Vector(); //����Ʈ �뷮 10�� ���� ���� //���Ϳ��� �ؽ��ڵ尡 ����ǰ�, �迭���� �ؽ��ڵ�� ���� ���� �����ϴ�.
		v.add("Hello");
		v.add(new Integer(4));	// v.add(4); �̷��� �Ǹ� ����ڽ�! v.add();�ȿ� �� ��üȭ�Ǽ� ���� �Ѵٴ� ���� ������ �ڽ���~��
		v.add(new Double(3.14));
		v.add(new Integer(5));
		
		int sum = 0;
		for(int i=0;i<v.size();i++) { //size : public int size() Returns the number of components in this vector.
			Object obj = v.get(i); //vector�� ���� get�̶�� �޼ҵ带 ȣ���ؼ�i���� ���� ����, ObjectŸ���� obj��� ������ �־��־���.
			//public E get(int index) Returns the element at the specified position in this Vector.
			/*
			System.out.println(v.get(0)); Hello
			System.out.println(v.get(1)); 4
			System.out.println(v.get(2)); 3.14
			System.out.println(v.get(3)); 5
			*/
			if(obj instanceof Integer) {
				Integer x = (Integer)obj; //downcasting : Object -> Integer
				int n = x.intValue(); 	  //��ڽ� : Integer -> Int			//public int intValue() Returns the value of this Integer as an int.
				// ���� �� ���� int n = (Integer)obj; �̷��� �� �ٷ� �� �� �ְ�, �����ڽ��̶�� �� �� �ִ�.
				sum += n;
			}
		}
		System.out.println("��� ������ ���� : " +sum);
	}
}
