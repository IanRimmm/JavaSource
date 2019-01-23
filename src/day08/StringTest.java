package day08;
	
public class StringTest {
	public void changeString(String src) {	//src는 매개변수, 호출되면서 뭔가를 받는 것은 매개변수이다.
		src = "JSP";
	}
	
	public static void main(String[] args) {
//		System.out.println("ABCD".toLowerCase());
//		System.out.println("ABCD".hashCode());
	
		String step = "JAVA";
		StringTest st = new StringTest();
		System.out.println(step);
		st.changeString(step);	//JSP로 변경하기 위해 할당
		System.out.println(step);
	}
}
//		"JAVA"말고 "JSP"로 받는 방법!
//public class StringTest {
//	public String changeString(String src) {	// void -> return 값!
//		src = "JSP";
//		return src;
//	}
//	
//	public static void main(String[] args) {
////		System.out.println("ABCD".toLowerCase());
////		System.out.println("ABCD".hashCode());
//	
//		String step = "JAVA";
//		StringTest st = new StringTest();
//		System.out.println(step);
//		step = st.changeString(step);	// st.ch~을 step으로 받는다!
//		System.out.println(step);
//	}
//}