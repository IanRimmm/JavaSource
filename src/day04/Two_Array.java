package day04;

public class Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][]m2= new int[3][2];
		int[][] m = { { 10, 20 }, { 30, 40 }, { 50, 60 } };
						// 1차원이 '행', 2차원이 '열'이다. 여기서 int[][] 첫 번째께 1차원, 두 번째게 2차원이다.
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("m[" + i + "]n[" + j + "]=" + m[i][j]);
			}
		}
	}

}
