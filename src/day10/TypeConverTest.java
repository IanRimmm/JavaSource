package day10;

public class TypeConverTest {
	public static void main(String[] args) {
		TypeConvert tc = new TypeConvert();
		Object obj = tc; // Object 클래스의 메소드만 호출가능, 업캐스팅.
		
//		Object obj1 = new TypeConvert();	//업캐스팅, 변수는 obj 한 개. 위의 두 줄은 tc와 obj 두 개.
		
		System.out.println(obj.toString());	//toString은 Object의 것인데, 타입은 TypeConver이다. 결과값 : day10.TypeConvert@7852e922
		System.out.println(tc.getUrl());

		System.out.println(obj.hashCode());
		System.out.println(tc.hashCode());

		TypeConvert tc2 = (TypeConvert) obj; //다운캐스팅
		System.out.println("tc2: " + tc2.getUrl());
		System.out.println("tc2: " + tc2.hashCode());
	}
}

class TypeConvert { // 모든 클래스는 extends Object가 생략되어 있다.
	String url = "http://www.kma.go.kr";

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "오버라이딩된 자식의 toString() 메소드";	//syso(obj.toString());에서 타입에만 접근하다가(여기선 해쉬코드값), 오버라이딩되면 값이 출력된다.
	}
	
}