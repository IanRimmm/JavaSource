package test.day07;
	
class Hello{
	//������� �� ĸ��ȭ
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
	
	//������ �����ε�
	public Hello() {}
	public Hello(char b[]) {}
	
	//������
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