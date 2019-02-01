package conding.day12;

public class SubObject extends SuperObject{
	
	public static void main(String[] args) {
		
		protected void draw() {
	}
}

class SuperObject{
	protected String name;
		public void paint() {
			draw();
		}
		public void draw() {
			System.out.println(name);
		}
}