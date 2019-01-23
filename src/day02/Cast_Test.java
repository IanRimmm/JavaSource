package day02;

public class Cast_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1234;
		int k;
		float f =10.5f;
		double d =100.55;
		
		k=(int)f;
		System.out.println(k);
		
		f=i;					// 이해가 안됨! 내일 질문!
		System.out.println(f);
		
		f=(float)d;				// float은 4byte 실수인데 그럼 100.5 여야 하는 것 아닌가?
		System.out.println(f);

	}

}
