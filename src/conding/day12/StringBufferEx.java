package conding.day12;

public class StringBufferEx {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode());	//생성 후 스트링버퍼 해쉬값 출력
		sb.append(" is pencil");	//문자열 덧붙이기
		System.out.println(sb);
		sb.insert(7, " my"); //문자열 삽입	//insert(7, " my")의 의미는 7번 째 열에 " my"를 집어넣겠다.
		System.out.println(sb);
		sb.replace(8, 10, "your");	//문자열 대치	//replace(8,10,"your")의 의미는  8,9번 째 열을 "your"로 대체하겠다.
		System.out.println(sb);
		sb.setLength(5);	//스트링버퍼 내 문자열 길이 설정	//setLength(5)의 의미는 문자열 길이를 5로 만들겠다.
		System.out.println(sb);
		System.out.println(sb.hashCode());	//문자열 조작 후 스트링 버퍼의 해쉬 코드
											//값이 같으면 같은 객체임을 나타낸다.
	}
}

/*
1. StringBuffer란?
지정된 문자열 내용에 초기화된 스트링 버퍼를 구축한다.
문자열 버퍼의 초기 용량은 문자열 인수의 길이에 16을 더한 값이다.

2. StringBuffer를 사용하는 이유?
- 논리적으로 따져보면 클래스(객체)가 생성될 때 method와 variable도 같이 생성되는데,
String이 계속해서 생성된다면, String의 주소값이 stack영역에 쌓이고,
 클래스(객체)들은 GC가 호출되기 전까지 heap영역에 지속적으로 쌓이게 된다.
 이는 메모리 관리적인 측면에서 치명적이기 때문에,
 StringBuffer를 사용해서 1개의 클래스(객체)로 시간과 메모리를 단축시킨다.
*/