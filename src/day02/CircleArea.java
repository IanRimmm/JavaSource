package day02;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14; //아무리 다른 값을 선언해줘도 final 로 선언해 줬기 때문에 다른 값이 들어가지 못하고 고정 값이 된다
		double radius=10;
		double circleArea=0;
		
		circleArea = radius*radius*PI;
		
		System.out.print("원의 면적=");
		System.out.println(circleArea);

	}

}
