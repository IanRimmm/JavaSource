package day05;

public class T6 {
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		
		if(a>0) {
			System.out.println(a+"�� ���");
		}else if(a<0){
			System.out.println(a+"�� ����");
		}else{
			System.out.println(a+"�� 0");
		}
	}
}
