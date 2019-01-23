package day08;

public class Scjp {
	public static void main(String[] args) {
		System.out.println("ScjpPass.BONUS : "+ ScjpPass.BONUS);
		
		//t1은 static이 아니므로 클래스명으로 접근할 수 없다.	//멤버변수는 객체를 생성해야만 사용할 수 있다.
		//System.out.println(ScjpPass.t1);
		//heap money 할당
		ScjpPass sp = new ScjpPass(85, 90, 80, 70);
		System.out.println("sp.t1 : " + sp.t1);
		//static변수는 클래스명으로 접근을 권장한다.
		//System.out.println("sp.BONUS" + sp.BONUS);
	}
}

class ScjpPass{
	//멤버 변수, Heap
		int t1 = 0;
		int t2 = 0;
		int t3 = 0;
		int t4 = 0;
			
	//클래스 변수, Data area
		static int BONUS = 100;
			
	//생성자, Source area
		public ScjpPass() {}
		
	//생성자, this = sp객체가 가지고 있는 hascode
	//sp객체의 heap메모리를 공유하게됩니다.
	//int t1, int t2, int t3, int t4:Stack
		public ScjpPass(int t1, int t2, int t3, int t4) {
			this.t1 = t1;
			this.t2 = t1;
			this.t3 = t1;
			this.t4 = t1;
			
		}
}	