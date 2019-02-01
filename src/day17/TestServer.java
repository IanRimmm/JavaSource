package day17;

import java.net.*;
import java.io.*;

public class TestServer {
	
	public static void main(String[] args) {
		System.out.println("임찬호 서버 프로그램 작동했습니다.");
		ServerSocket server = null;
		
		try {
			//2019포트로 ServerSocket 생성
			server = new ServerSocket(2007);
			while(true) {	//데몬이 되기 위한 무한 루프	//모든 사람들이 접속할 수 있게 client의 응답을 항상 받을 수 있게 대기하는 것.
				System.out.println("클라이언트 접속을 대기중입니다.");
				Socket client = server.accept();	//Socket은 누가 접속했는지에 대한 정보를 알고 있다.
				
				InetAddress ia = client.getInetAddress();	//InetAddress를 뽑아온다는 것은
				int port = client.getLocalPort();	//접속에 사용된 port	//클라이언트가 2019 서버에 접속하기 위해 사용된 포트
				String ip = ia.getHostAddress();	//원격 client IP
				System.out.println("~" + port + ip);
				//한글을 출력할 수 있습니다.
				//Client로 출력할 객체 생성.
				BufferedWriter writer = 
				new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));	//OutputStream에서 -> 
				
				//버퍼에 문자열을 기록함
				writer.write("임찬호 서버에 접속 하신것을 환영 합니다.");
				
				//실제로 Client로 전송함
				writer.flush();
				try {
					client.close();	//소켓 닫음
				}catch(IOException e) {
					System.out.println("~" + e.toString());
				}
			}
		}catch(IOException ioe) {
			System.err.println("Exception generated");
		}finally {
			try {
				server.close();
				System.out.println("서버 작동을 종료합니다.");
			}catch(IOException e) {
				System.out.println("ServerSocket을 닫는 중 에러가 났습니다." + e);
			}
			//아무키나 누를 때까지 대기합니다.
			try {
				InputStream is = System.in;
				is.read();
			}catch(Exception e) {
				
			}
			System.out.println("서버 프로그램 실행을 종료합니다.");
		}
	}
}