package day08;
	
public class StringTest {
	public void changeString(String src) {	//src�� �Ű�����, ȣ��Ǹ鼭 ������ �޴� ���� �Ű������̴�.
		src = "JSP";
	}
	
	public static void main(String[] args) {
//		System.out.println("ABCD".toLowerCase());
//		System.out.println("ABCD".hashCode());
	
		String step = "JAVA";
		StringTest st = new StringTest();
		System.out.println(step);
		st.changeString(step);	//JSP�� �����ϱ� ���� �Ҵ�
		System.out.println(step);
	}
}
//		"JAVA"���� "JSP"�� �޴� ���!
//public class StringTest {
//	public String changeString(String src) {	// void -> return ��!
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
//		step = st.changeString(step);	// st.ch~�� step���� �޴´�!
//		System.out.println(step);
//	}
//}