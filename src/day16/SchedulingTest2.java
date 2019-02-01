package day16;

public class SchedulingTest2 {

	public static void main(String[] args) {
		Thread[] t = new RunThread2[5]; // 업캐스팅(부모 클래스 것만 접근 가능), 오버라이딩 된 자식클래스의 메소드에 접근 가능(동적바인딩)

		t[0] = new RunThread2("☆");	// 이 모양들이 하나의 Thread 이름이 되는 것
		t[1] = new RunThread2("★");
		t[2] = new RunThread2("◆");
		t[3] = new RunThread2("◇");
		t[4] = new RunThread2("○");
		
		t[0].start(); //정의를 해 놓고 호출하진 않았다.
		t[1].start();
		t[2].start();
		t[3].start();
		t[4].start();
	}
}

class RunThread2 extends Thread {
	public RunThread2(String name) {
		super(name); 
	}

	@Override
	public void run() {
		for (int i = 1; i <= 30000000; i++) {
			if (i % 50 == 0) {
				System.out.println("Thread [" + getName() + "] : " + i);
				try {
					// sleep(1); //0.001초
					System.out.print("");
				} catch (Exception e) {
				}
			}
		}
	}

}