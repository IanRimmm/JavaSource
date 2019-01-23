package day04;

public class MutiArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		내가 2차원을 만들었다고 하더라도 메모리에서는 1차원 형식으로 만들어진다.
		int[] arr1= new int[3];
		int[][] arr2;
		arr2= new int[2][3];	//2행3열느낌! 0,0 0,1 0,2
										// 1,0 1,1 1,2
		
//		그저 length로 출력했을 때는 행의 길이만 나오게 된다.
		System.out.println("arr1배열의 열의 수: "+arr1.length+"\n");
		System.out.println("arr2배열의 행의 수: "+arr2.length+"\n");
											//오오 ~ 이해되기 시작했으~~
		
//		행을 통해서 열을 찾아낸다.+
		System.out.println("arr2배열의 1행의 열의 수: "+arr2[0].length+"\n");
		System.out.println("arr2배열의 2행의 열의 수: "+arr2[1].length+"\n");
	}

}
