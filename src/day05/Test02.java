package day05;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[6];
		System.out.println("로또 번호 : ");
		for(int i=1; i<=6;i++) {
			a[i] = (int)(Math.random()*45+1);
			System.out.print(a[i]+ " ");
		}
	}

}