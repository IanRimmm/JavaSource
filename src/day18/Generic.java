package day18;

import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.List; 

public class Generic {
	
	public static void main(String[] args) {
		//ArrayList 객체 10개를 저장할 수 있는 list 객체 변수 선언
		ArrayList list = new ArrayList(10);
		
		list.add(new Integer(10)); //Integer 추가
		list.add("List Test"); //String 추가
		
		//객체 배열에서 순차적으로 객체를 추출하기 위한 Iterator 객체 생성
		Iterator i = list.iterator();
		
		Integer su = (Integer)i.next();
		System.out.println("su = " + su);
		
		su = (Integer)i.next();	//Error발생	//그냥 지워주면 된다. 쓸 수 없으니까.
		System.out.println("su = " + su);
		
		/*
		 	지훈이형 스타일
		 	Integer su;
		 	while (i.hasNext()) {
			su = (Integer) i.next();
			System.out.println("su = " + su);
			}
		*/
	}
}
