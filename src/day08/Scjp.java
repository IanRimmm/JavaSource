package day08;

public class Scjp {
	public static void main(String[] args) {
		System.out.println("ScjpPass.BONUS : "+ ScjpPass.BONUS);
		
		//t1�� static�� �ƴϹǷ� Ŭ���������� ������ �� ����.	//��������� ��ü�� �����ؾ߸� ����� �� �ִ�.
		//System.out.println(ScjpPass.t1);
		//heap money �Ҵ�
		ScjpPass sp = new ScjpPass(85, 90, 80, 70);
		System.out.println("sp.t1 : " + sp.t1);
		//static������ Ŭ���������� ������ �����Ѵ�.
		//System.out.println("sp.BONUS" + sp.BONUS);
	}
}

class ScjpPass{
	//��� ����, Heap
		int t1 = 0;
		int t2 = 0;
		int t3 = 0;
		int t4 = 0;
			
	//Ŭ���� ����, Data area
		static int BONUS = 100;
			
	//������, Source area
		public ScjpPass() {}
		
	//������, this = sp��ü�� ������ �ִ� hascode
	//sp��ü�� heap�޸𸮸� �����ϰԵ˴ϴ�.
	//int t1, int t2, int t3, int t4:Stack
		public ScjpPass(int t1, int t2, int t3, int t4) {
			this.t1 = t1;
			this.t2 = t1;
			this.t3 = t1;
			this.t4 = t1;
			
		}
}	