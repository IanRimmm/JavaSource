package day05;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = {20,30,40,50,60};
		int sum=0;
		
		for(int i=0; i<intArray.length; i++) {
			sum += intArray[i];
		}
		System.out.println("ÇÕ°è : "+sum+" Æò±Õ : "+sum/intArray.length);
		
	}

}
