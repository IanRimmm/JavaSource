package conding.day12;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍현/콩쥐/팥쥐","/");	//구분자로 '/'를 사용
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
/*
1. StringTokenizer이란?
 지정된 문자열에 대한 문자열 형태의 토크나이저를 구성한다.
 구분기호 자체는 토큰으로 처리되지 않지만,
 생성된 StringTokenizer에서 다른 메소드를 호출하려고 하면  NullPointerException이 발생할 수 있다.
 
 "/" 등의 구분자가 있다면, 구분자를 기준으로 데이터화할 수 있당

2. .hasMoreTokens이란?
이 토큰 문자열에서 사용 가능한 토큰이 더 있는지 여부를 테스트한다. 
이 메소드가 true값을 돌려주면, 인수(argument)를 지정하지 않고 nextToken을 호출하면
성공적으로 토큰이 돌려주어진다.

*/