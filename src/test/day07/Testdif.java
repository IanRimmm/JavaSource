package test.day07;
	
class Hello{
	//멤버변수 및 캡슐화
	private char b[];
	
	public void setB(char b[]) {
		this.b = b;
	}
	public char getB() {
		return 'b';
	}
	public void getB(char b[]) {
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
	}
	
	//생성자 오버로딩
	public Hello() {}
	public Hello(char b[]) {}
	
	//연산자
	static void replace(char b[]) {
		for(int i=0; i<b.length;i++) {
			if(b[i]=='a') {
			b[i]='A';
			}else if(b[i]=='b') {
				b[i]='B';
			}else if(b[i]=='c') {
				b[i]='C';
			}else{
				break;
			}
		}
	}

public class Testdif {
	
	public static void main(String[] args) {
		char c[] = {'a','b','c'};
		
		Hello d = new Hello();
		d.getB(c);	
		
	}
}