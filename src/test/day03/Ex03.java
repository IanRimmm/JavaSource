package test.day03;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='C';
		String str ="ABC";
		
		if(str.charAt(0)=='A') {
			System.out.println("입력된 코드는 A입니다.");
		}else if(str.charAt(0)=='B') {
			System.out.println("입력된 코드는 B입니다.");
		}else if(str.charAt(0)=='C') {
			System.out.println("입력된 코드는 C입니다.");
		}else if(str.charAt(0)=='D') {
			System.out.println("입력된 코드는 D입니다.");
		}else
			System.out.println("코드는 A부터 D까지 입력해야햠");
	}
}
