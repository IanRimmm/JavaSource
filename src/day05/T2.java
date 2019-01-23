package day05;

public class T2 {
	public static void main(String[] args) {
		double[] real = {10, 8, 10.11, 10.111, 10.1111};
		
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		
		for(int i=0; i<real.length; i++) {
			if(max < real[i]) {
				max = real[i];
			}
			
			if(min > real[i]) {
				min = real[i];
						
			}
		}
		System.out.println("최대값: "+max+", 최소값: "+min);
	}
}