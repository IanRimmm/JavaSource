package day16;

public class ThreadTest2 {

	public static void main(String[] args	) {
		//Runnable Interface�� ������ Ŭ���� ��ü�� Thread Ŭ������ �����ڷ� �Ҵ��մϴ�.
		
		Thread t1 = new Thread(new ThreadOne("first", 1000));
		Thread t2 = new Thread(new ThreadOne("second", 1000));
		Thread t3 = new Thread(new ThreadOne("third", 1000));
		
		t1.start();
		t2.start();
		t3.start();
	}
}

class ThreadOne implements Runnable{
	private int num;
	private String name;
	public ThreadOne(String a, int b) {
		name = a;
		num = b;
	}
	
	public void run() { //CallBack �޼ҵ�
		for(int i=0;i<num;i++)
			System.out.println(name + " : " + i);
	}
}