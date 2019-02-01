package day17;

/*
 InetAddress Class��? IP�ּҿ� ���õ� ���� ���� ����
 InetAddress�� ��ü�� �����ϱ� ���� ����ƽ�� getByName()�޼ҵ带 �̿��Ѵ�.
 */
import java.net.*;

public class AddressTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		// InetAddress�� Ŭ������ ����, ��Ӻ����� ����. static�޼ҵ�� ��������� ������ �ʿ䰡 ����.
		// getLocalHost() �޼ҵ�� static���� ����� Ŭ���� �޼ҵ���
		System.out.println("���� ��ǻ���� �̸� : " + address.getHostName());
		System.out.println("���� ��ǻ���� IP�ּ� : " + address.getHostAddress());

		// getByName�� ����(��)��ǻ�� ����, ���� �������� IP�ּҸ� ������� ����.
		address = InetAddress.getByName("java.sun.com");
		System.out.println("java.sun.com ������ �̸��� IP�ּ�" + address);

		InetAddress SW[] = InetAddress.getAllByName("naver.com");
		for (int i = 0; i < SW.length; i++) {
			System.out.println(SW[i]);
		}
	}
}
