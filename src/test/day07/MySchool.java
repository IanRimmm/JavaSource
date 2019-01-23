// 다음은 final과 static을 사용하는 예시입니다.
// Hwang과 Park 두 사람이 있습니다. 
// 두 사람은 각각 번갈아가며 개인 과제와 공통 과제를 함께 수행하는 상황입니다.
// 결과) 공통과제: 5번, 개인과제: Park 3번 Hwang 2번

package test.day07;

class Work {
	final static int TryCommonCnt = 5; // 공통과제 횟수 목표치는 고정된 값이다.
	static int CommonWork = 0;
	int severalWork = 0;
	boolean isHwang = false;

	void doWork() {
		CommonWork++;
		severalWork++;
		if (isHwang == true) {
			System.out.println("공통 과제" + CommonWork + "번, " + "Hwang 과제" + severalWork + "번 수행했습니다.");
		} else {
			System.out.println("공통 과제" + CommonWork + "번, " + "Park 과제" + severalWork + "번 수행했습니다.");
		}
	}
}

public class MySchool {
	public static void main(String[] args) {
		Work Hwang = new Work();
		Work Park = new Work();
		for (int i = 1; i <= Work.TryCommonCnt; i++) {
			if (i % 2 == 0) {
				Hwang.isHwang = true;
				Hwang.doWork();
			} else {
				Park.isHwang = false;
				Park.doWork();
			}
		}
	}
}