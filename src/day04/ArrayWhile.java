package day04;

public class ArrayWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String[] movies={
				"�׷���Ƽ",
				"���� �̾�",
				"���������",
				"������ ����� ������ �ȴ�.",
				"���",
				"���� ���� ����ο�",
				"Ʈ��������",
				"X-MEN"};
		
		int cnt =-1;
		System.out.println("�迭�� ���� ����: "+movies.length);
		
		while(true) {
			cnt = cnt+1;
			System.out.println(movies[cnt]);//0~7
										//	  /	
			if(cnt==movies.length-1)   //cnt=7 �� moive.length-1 = 8-1 = 7�϶� �������Ƿ�, break�Ѵٴ� ��
				break;
		}
	}

}

