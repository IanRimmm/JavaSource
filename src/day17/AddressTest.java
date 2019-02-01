package day17;

/*
 InetAddress Class란? IP주소와 관련된 여러 정보 제공
 InetAddress의 객체를 생성하기 위해 스태틱의 getByName()메소드를 이용한다.
 */
import java.net.*;

public class AddressTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		// InetAddress은 클래스도 없고, 멤머변수도 없다. static메소드는 멤버변수를 생성할 필요가 없다.
		// getLocalHost() 메소드는 static으로 선언된 클래스 메소드임
		System.out.println("로컬 컴퓨터의 이름 : " + address.getHostName());
		System.out.println("로컬 컴퓨터의 IP주소 : " + address.getHostAddress());

		// getByName은 로컬(내)컴퓨터 말고, 현재 실행중인 IP주소를 갖고오기 위함.
		address = InetAddress.getByName("java.sun.com");
		System.out.println("java.sun.com 도메인 이름과 IP주소" + address);

		InetAddress SW[] = InetAddress.getAllByName("naver.com");
		for (int i = 0; i < SW.length; i++) {
			System.out.println(SW[i]);
		}
	}
}
