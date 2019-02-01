package day16;

public class ThreadTest1 {
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread("first", 1000);
		MyThread t2 = new MyThread("second", 1000);
		MyThread t3 = new MyThread("third", 1000);
		
		t1.start();
		t2.start();
		t3.start();
	}
}

class MyThread extends Thread{
	private int num;
	private String name;
	
	public MyThread(String a, int b) {
		name = a;
		num = b;
	}
	
	public void run() {	//Callback ¸Þ¼Òµå
		for(int i=0;i<num;i++) {
			System.out.println(name + " : " + i);
		}
	}
}