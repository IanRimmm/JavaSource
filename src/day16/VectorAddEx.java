package day16;

import java.util.Vector;

public class VectorAddEx {
	
	public static void main(String[] args) {
		Vector v = new Vector(); //디폴트 용량 10의 벡터 생성 //백터에는 해쉬코드가 저장되고, 배열에는 해쉬코드와 값도 저장 가능하다.
		v.add("Hello");
		v.add(new Integer(4));	// v.add(4); 이렇게 되면 오토박싱! v.add();안에 는 객체화되서 들어가야 한다는 생각 때문에 박싱이~ㅇ
		v.add(new Double(3.14));
		v.add(new Integer(5));
		
		int sum = 0;
		for(int i=0;i<v.size();i++) { //size : public int size() Returns the number of components in this vector.
			Object obj = v.get(i); //vector를 통해 get이라는 메소드를 호출해서i값을 넣은 것을, Object타입의 obj라는 변수에 넣어주었다.
			//public E get(int index) Returns the element at the specified position in this Vector.
			/*
			System.out.println(v.get(0)); Hello
			System.out.println(v.get(1)); 4
			System.out.println(v.get(2)); 3.14
			System.out.println(v.get(3)); 5
			*/
			if(obj instanceof Integer) {
				Integer x = (Integer)obj; //downcasting : Object -> Integer
				int n = x.intValue(); 	  //언박싱 : Integer -> Int			//public int intValue() Returns the value of this Integer as an int.
				// 위의 두 줄을 int n = (Integer)obj; 이렇게 한 줄로 쓸 수 있고, 오토언박싱이라고 할 수 있다.
				sum += n;
			}
		}
		System.out.println("모든 정수의 합은 : " +sum);
	}
}
