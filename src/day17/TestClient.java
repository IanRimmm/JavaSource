package day17;

import java.io.*;
import java.net.*;

public class TestClient {

	public static void main(String[] args) {
		System.out.println("Ŭ���̾�Ʈ ���α׷� �۵�");
		Socket socket = null;

		try {
			socket = new Socket(args[0], 2007);
			System.out.println("������ ����Ǿ����ϴ�.");

			InetAddress ia = socket.getInetAddress();
			int port = socket.getLocalPort();
			String ip = ia.getHostAddress();
			System.out.println("������ ���� ����  : " + "Local Port : " + port + "IP" + ip);
			// �����κ��� �����͸� �Է¹޾� ���ۿ� �����մϴ�.
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// ���۷κ��� �� ���ξ� �о� ����մϴ�.
			// Blocking���¿��� ��ٸ��ϴ�.
			String line = reader.readLine();
			System.out.println(line);
		} catch (IOException ioe) {
			System.out.println("Exception generated");
		} finally {
			try {
				socket.close();
				System.out.println("�������� ������ �����մϴ�.");
			} catch (Exception ignored) {
			}
		}
		// �ƹ�Ű�� ���� ������ ����մϴ�.
		InputStream is = System.in;
		try {
			is.read();
		} catch (Exception e) {

		}
		System.out.println("Client ���α׷� ������ �����մϴ�.");
	}
}
/*
 * try{ InetAddress ia = socket.getInetAddress(); 
 * int port = socket.getLocalPort();
 * String ip = ia.getHostAddress();
 * }catch(IOException ioe){ }
 * �̰��� �ణ ����ȭ�� ���� ����!
 */