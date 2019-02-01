package day16;

public class SleepThreadMain {
	
	public static void main(String[] args	) {
		SleepThread t1 = new SleepThread("a");
		SleepThread t2 = new SleepThread("b");
		SleepThread t3 = new SleepThread("c");
		
		t2.setPriority(7); //1~10 Ŭ���� �켱����
		t1.start(); //t2�� t1���� �켱����
		try {
			t1.join(); //t1�� ���� �� t2, t3�� �����Ѵ�.
		}catch(InterruptedException ite) {}
		t2.start();
		t3.start();
	}
}

class SleepThread extends Thread{
	public SleepThread(String name) {
		setName(name);
	}
	
	public void run() {show();}
	public void show() {
		for(int i=0;i<50;i++) {
			print();
			
			try {
				Thread.sleep(50); //50 //100 ��
			}catch(InterruptedException ite) {}
		}
	}
	
	public void print() {
		System.out.print(getName()); //Thread����
	}
}