package day12;

public class Constant {
	public static final int COUNT = 1;
	
	public void prn() {
		//COUNT = 5;
		for(int i=0; i<COUNT ;i++) {
			System.out.println("JAVA");
		}
		
		for(int i=0;i<COUNT;i++) {
			System.out.println("JSP");
		}
		
		for(int i=0;i<COUNT;i++) {
			System.out.println("EJB");
		}

		for(int i=0;i<COUNT;i++) {
			System.out.println("CBD Oracle OJT");
		}
	}
	
	public static void main(String[] args) {
		Constant constant = new Constant();
		constant.prn();
		
		for(int i=0;i<Constant.COUNT;i++) {
			System.out.println("Struts");
		}
	}
}
