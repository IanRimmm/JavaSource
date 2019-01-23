package day02;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i = 20; 
	    	int j = 12; 

	      int a = i + j; 
	      int b = i - j; 
	      int c = i * j; 
	      int d = i / j; 
	      int e = i % j; 
	      float n = 0.0f;	// 왜f를 제거하면 double이 될까? 왜 그런거지?

	      System.out.println("i : " + i + "j : " + j); 
	      System.out.println("덧셈 결과 : " + a); 
	      System.out.println("뺄셈 결과 : " + b); 
	      System.out.println("곱셈 결과 : " + c); 
	      System.out.println("나눗셈 결과 : " + d); 
	      System.out.println("나머지 결과 : " + e); 
	       
	      n = i/j; 
	      System.out.println("정수/정수의 결과:" + n); 
	}

}
