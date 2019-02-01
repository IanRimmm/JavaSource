package conding.day12;

public class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		
		int i = 10;
		Integer intObject = i; // auto boxing : 기본형 -> 참조형 (자동 형변환)
		// 10을 통해 만든 해쉬코드갑이 들어가는 것 뿐!
		System.out.println("IntObject = "+intObject);
		
		i = intObject + 10; // auto unboxing : 참조형 -> 기본형
		System.out.println("i = " + i);
	}
}
