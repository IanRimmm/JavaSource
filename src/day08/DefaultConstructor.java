package day08;

public class DefaultConstructor {
	int x;
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	
//	public DefaultConstructor() {
//		
//	}
	public DefaultConstructor(int x) {
		this.x = x;
	}
	
	public static void main(String[] args) {
		DefaultConstructor p1 = new DefaultConstructor(3);
		int n = p1.getX();
		
		DefaultConstructor p2 = new DefaultConstructor();	// why? 기본생성자가 없기 때문에!
		p2.setX(5);
	}
}
