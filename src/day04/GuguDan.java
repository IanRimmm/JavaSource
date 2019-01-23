package day04;

public class GuguDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=9; i>=1; i-=3) {
			System.out.println(" "+i+"´Ü\t "+(i-1)+"´Ü\t "+(i-2)+"´Ü");
			System.out.println("------------------------");
			for(int j=9; j>=1; j--) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				System.out.print((i-1)+"*"+j+"="+(i-1)*j+"\t");
				System.out.print((i-2)+"*"+j+"="+(i-2)*j);
				
				System.out.println("");
			}
			System.out.println("");
		}
	}

}
