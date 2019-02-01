package day15;

import java.util.*;

public class SearchDelete {
	//size�� capacity�� ����� ���̸� �� ��!
	public static void main(String[] args) {
		String name[] = { "��ȹ��", "������", "������" };

		Vector v = new Vector();			//capacity�� ���� �뷮, vector�� 10�� ������ ũ�⸦ ���� �ִ�!
		
		/*
		 ��� �߰��� v.add(); //v.addElement(); ���Ϳ��� �ִ� ��
		 ��� ���Ŵ� v.remove();
		 */
		// Vector�� �迭 ��� ����
		for (int i = 0; i < name.length; i++) {
			v.addElement(name[i]);

		}

		// "������"�� �ִ��� �˻�
		if (v.contains("������")) {
			int i = v.indexOf("������");
			System.out.println("�ش� ��ü�� �ε���" + (i + 1) + "��°�� �ֽ��ϴ�.");
		} else {
			System.out.println("�ش� ��ü�� �����ϴ�.");
		}

		// ù ��° ��� ����
		v.removeElementAt(0);
		System.out.println("===== ���찡 �� �Ŀ��� =====");
		String s = "";
		for (int j = 0; j < v.size(); j++) {
			s = (String) v.elementAt(j);		//elementAt = get�̶� �Ȱ���!	//object�� String���� �ٿ�ĳ���� �ƴٰ� �����ϸ� ��!
			System.out.println("Vector" + j + "��° ��Ҵ�" + s);
		}
		System.out.println("\n�ʱ���� ũ��.............");
		System.out.println("������Ʈ�� ���� " + v.size()); //2	// ��ü�� ������ �� �ִ� �ʱ� ������
		System.out.println("������ ũ��� " + v.capacity()); //10

		System.out.println("\nv.trimToSize()��......");
		v.trimToSize(); // ���� �Ҵ���� �ʾ��� �޸� ����(�޸� ����?�����̶�� ����!)	//trim
		System.out.println("������Ʈ�� ���� " + v.size()); //2	//size�� ������ �����Ͱ� �� ����
		System.out.println("������ ũ��� " + v.capacity());	//2

		System.out.println("\n�����̳� ��� �߰���.........");
		v.addElement("�����̳�");
		System.out.println("������Ʈ�� ���� " + v.size()); //3
		System.out.println("������ ũ��� " + v.capacity()); //2*2 = 4

		System.out.println("\nCoder ��� �߰���.........");
		v.addElement("Coder");
		System.out.println("������Ʈ�� ���� " + v.size()); //4
		System.out.println("������ ũ��� " + v.capacity()); //4

		System.out.println("\nPM ��� �߰� ��...........");

		v.addElement("PM");
		System.out.println("������Ʈ�� ���� " + v.size()); //5
		System.out.println("������ ũ��� " + v.capacity()); //4*2 = 8
	}

}
