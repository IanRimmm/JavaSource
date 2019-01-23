package day08;

public class StaticDemo {
	public static void main(String[] args) {
		// ��ü ����
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		Box mybox3 = new Box();
		
	}
}

class Box{
	int cnt = 0;
	static long boxID = 0;	
	
	public Box() {
		boxID = boxID + 1;	//static variable
		cnt = cnt + 1;		//member variable
		System.out.println("��� ���� cnt :"+cnt);
		System.out.println("static ���� BoxID :"+boxID);
	}
/*	��� �޼ҵ忡���� static ������ ������ �� �����ϴ�.
	public void staticTest(){
		static long count = 0;
		count = count + 1;
	}
	
 	static(class) �޼ҵ忡 static ������ ������ �� �����ϴ�.
 	public static void staticTest2(){
 		static long count = 0;
 		count = count + 1;
 	}
 */

}
