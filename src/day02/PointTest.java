package day02;


public class PointTest { //하나의 파일에 클래스를 두개 생성할 수 있는데 
						//main 함수는 무조건 한개만있어야함

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point obj1 = new Point(10,20); //생성자 호출 
									  //생성자를 초기화하기 위해 객체 생성 ->메모리할당 
		Point obj2 = obj1;
		
		System.out.printf("obj1 =(%d, %d) %n", obj1.x,obj1.y);
		System.out.printf("obj2 =(%d, %d) %n", obj2.x,obj2.y);
		
		obj2.x=30;
		System.out.printf("obj1 ="
				+ "(%d, %d) %n", obj1.x,obj1.y);
		System.out.printf("obj2 =(%d, %d) %n", obj2.x,obj2.y);
		
		System.out.println("obj1:"+ obj1.hashCode());
		System.out.println("obj2:"+ obj2.hashCode());
	}

}
