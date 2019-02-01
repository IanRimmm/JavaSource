package conding.day12;

public class EqualsEx {
	
	public static void main(String[] args) {
	
		React a = new React(2,3);
		React b = new React(3,2);
		React c = new React(3,4);
		
		if(a.equals(b)) System.out.println("a is equal to b");
		if(a.equals(c)) System.out.println("a is equal to c");
		if(a.equals(c)) System.out.println("b is equal to c");
	}
}

class React{
	int width;
	int height;
	
	public React(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(React p) {
		if(width*height == p.width*p.height) //삭가형 면적 비교
			return true;
		else 
			return false;
		
	}
}