package day05;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(int i=1;i<=6;i++) {
			if(i>1){
				for(int j=0; j<i-1;j++) {
					System.out.print(" ");
				}
			}
			for(int j=1;j<=(6-i);j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
