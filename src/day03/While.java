package day03;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=-5;
		
		while (j<=0) {
			System.out.println("번호 :"+j);
			j++;
			if(j==-3)
				break;	
		
		}
		System.out.println("====================");
		System.out.println("While종료후 j의 값"+j);
	}

}
