package day04;

public class ArrayWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String[] movies={
				"그래비티",
				"맘마 미아",
				"레미제라블",
				"월터의 상상은 현실이 된다.",
				"노아",
				"엣지 오브 투모로우",
				"트랜센던스",
				"X-MEN"};
		
		int cnt =-1;
		System.out.println("배열의 값의 갯수: "+movies.length);
		
		while(true) {
			cnt = cnt+1;
			System.out.println(movies[cnt]);//0~7
										//	  /	
			if(cnt==movies.length-1)   //cnt=7 과 moive.length-1 = 8-1 = 7일때 같아지므로, break한다는 뜻
				break;
		}
	}

}

