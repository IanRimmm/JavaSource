package test.day11;

class ClassA {

	String A = "A";
	String A2 = "A2";

	public void methodA() {
		System.out.println("methodA");
	}

	public void methodA2() {
		System.out.println("methodA2");
	}
}

class ClassExtendA extends ClassA {
	String A = "ExA";
	String A3 = "ExA3";

	public void methodA() {
		System.out.println("methodExA");
	}

	public void methodA3() {
		System.out.println("methodExA3");
	}
}

public class TestExtend {

	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ClassExtendA cea = new ClassExtendA();
		ClassA cea2 = new ClassExtendA();

		System.out.println("---------------------기본호출----------------------");

		// 변수호출
		System.out.println("ca.A	  =" + ca.A);
		System.out.println("cea.A	  =" + cea.A);
		System.out.println("cea2.A	  =" + cea2.A);
		// 메소드호출
		System.out.print("ca.methodA()	  =");
		ca.methodA();
		System.out.print("cea.methodA()	  =");
		cea.methodA();
		System.out.print("cea2.methodA()	  =");
		cea2.methodA();
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------형변환호출--------------------");
		// 형변환 변수 호출
		System.out.println("((ClassA)cea).A	  =" + ((ClassA) cea).A);
		System.out.println("((ClassExtendA)cea2).A	  =" + ((ClassExtendA) cea2).A);
		// 형변환 메서드 호출
		System.out.print("((ClassA)cea).methodA	  =");
		((ClassA) cea).methodA();
		System.out.print("((ClassExtendA)cea2)	  =");
		((ClassExtendA) cea2).methodA();

		System.out.println("----------------------------------------------------");
		System.out.println("-----------부모클래스의 변수, 메소드 호출-----------");
		// 상위 클래스만 존재하는 변수 호출
		System.out.println("ca.A2	  =" + ca.A2);
		System.out.println("cea.A2	  =" + cea.A2);
		System.out.println("cea2.A2	  =" + cea2.A2);
		// 상위 클래스에만 존재하는 메소드 호출
		System.out.print("ca.methodA2()	  =");
		ca.methodA2();
		System.out.print("cea.methodA2()	  =");
		cea.methodA2();
		System.out.print("cea2.methodA2()	  =");
		cea.methodA2();

		System.out.println("-----------------------------------------------------");
		System.out.println("-형변환시 부모클래스에만 존재하는 변수 , 메소드 호출-");
		// 형변환시 부모클래스에만 존재하는 변수 호출
		System.out.println("((ClassA)cea).A2	  =" + ((ClassA) cea).A2);
		System.out.println("((ClassExtendA)cea2).A2	  =" + ((ClassExtendA) cea2).A2);
		// 형변환시 부모클래스에만 존재하는 메소드 호출
		System.out.print("((ClassA)cea).methodA2()  =");
		((ClassA) cea).methodA2();
		System.out.print("((ClassA)cea2).methodA2() =");
		((ClassA) cea2).methodA2();

	}

}