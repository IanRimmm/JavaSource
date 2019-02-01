//스레드를 이용하지 않은 경우
package day16;

public class NonThread {

	public static void main(String[] args) {
		
		GenClass t1 = new GenClass("first", 5);
		GenClass t2 = new GenClass("second", 5);
		GenClass t3 = new GenClass("third", 5);
		
		t1.start();
		t2.start();
		t3.start();
	}

}

class GenClass{
	private int num;
	private String name;
	
	public GenClass(String a, int b) {
		name = a;
		num = b;
	}
	
	public void start() {
		for(int i=0; i<num;i++) {
			System.out.println(name + " : " + i);
		}
	}
}