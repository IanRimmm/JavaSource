package day15;

import java.util.*;

public class SearchDelete {
	//size와 capacity의 관계와 차이를 알 것!
	public static void main(String[] args) {
		String name[] = { "기획자", "설계자", "개발자" };

		Vector v = new Vector();			//capacity는 가용 용량, vector는 10내 정도의 크기를 갖고 있다!
		
		/*
		 요소 추가는 v.add(); //v.addElement(); 벡터에만 있는 것
		 요소 제거는 v.remove();
		 */
		// Vector에 배열 요소 저장
		for (int i = 0; i < name.length; i++) {
			v.addElement(name[i]);

		}

		// "개발자"가 있는지 검사
		if (v.contains("개발자")) {
			int i = v.indexOf("개발자");
			System.out.println("해당 객체의 인덱스" + (i + 1) + "번째에 있습니다.");
		} else {
			System.out.println("해당 객체가 없습니다.");
		}

		// 첫 번째 요소 삭제
		v.removeElementAt(0);
		System.out.println("===== 지우가 난 후에는 =====");
		String s = "";
		for (int j = 0; j < v.size(); j++) {
			s = (String) v.elementAt(j);		//elementAt = get이랑 똑같다!	//object가 String으로 다운캐스팅 됐다고 생각하면 됌!
			System.out.println("Vector" + j + "번째 요소는" + s);
		}
		System.out.println("\n초기상태 크기.............");
		System.out.println("엘러멘트의 수는 " + v.size()); //2	// 객체를 저장할 수 있는 초기 사이즈
		System.out.println("벡터의 크기는 " + v.capacity()); //10

		System.out.println("\nv.trimToSize()후......");
		v.trimToSize(); // 값이 할당되지 않았은 메모리 삭제(메모리 정리?느낌이라고 생각!)	//trim
		System.out.println("엘러멘트의 수는 " + v.size()); //2	//size는 실제로 데이터가 들어간 길이
		System.out.println("벡터의 크기는 " + v.capacity());	//2

		System.out.println("\n디자이너 요소 추가후.........");
		v.addElement("디자이너");
		System.out.println("엘러멘트의 수는 " + v.size()); //3
		System.out.println("벡터의 크기는 " + v.capacity()); //2*2 = 4

		System.out.println("\nCoder 요소 추가후.........");
		v.addElement("Coder");
		System.out.println("엘러멘트의 수는 " + v.size()); //4
		System.out.println("벡터의 크기는 " + v.capacity()); //4

		System.out.println("\nPM 요소 추가 후...........");

		v.addElement("PM");
		System.out.println("엘러멘트의 수는 " + v.size()); //5
		System.out.println("벡터의 크기는 " + v.capacity()); //4*2 = 8
	}

}
