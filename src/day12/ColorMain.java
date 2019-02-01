package day12;

public class ColorMain {
	
	public static void main(String[] args) {
		
		Green g = new GreenImpl();
		System.out.println(g.greenColor());
		
		Red r = new RedImple();
		System.out.println(r.redColor());
		
		ColorImpl c = new ColorImpl();
		System.out.println(c.greenColor());
		System.out.println(c.redColor());
	}
}

interface Green{
	//�߻� �޼ҵ�
	/*public*/ String greenColor();
}

class GreenImpl implements Green{
	public String greenColor() {
		return "�ʷϻ��Դϴ�.";
	}
}

interface Red{
	//�߻� �޼ҵ�
	/*public*/ String redColor();
}

class RedImple implements Red{
	String redColor() {
		return "�������Դϴ�.";
	}
}

class ColorImpl implements Green, Red{
	public String greenColor() {
		return "�ʷϻ��Դϴ�.";
	}
	
	public String redColor() {
		return "�������Դϴ�.";
	}
}