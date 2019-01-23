package day05;

public class T3 {
	public static void main(String[] args) {
		
		int[] ebay = {-20, -10, 0, 10, 20};
		
		int a = 0;
				
			for(int i=0; i<ebay.length ;i++) {
				if(0>ebay[i]) {
					a = (-1)*ebay[i];
				}else{
					a = ebay[i];
				}
				System.out.println(a);
			}
			
	}
}