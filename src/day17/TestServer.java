package day17;

import java.net.*;
import java.io.*;

public class TestServer {
	
	public static void main(String[] args) {
		System.out.println("����ȣ ���� ���α׷� �۵��߽��ϴ�.");
		ServerSocket server = null;
		
		try {
			//2019��Ʈ�� ServerSocket ����
			server = new ServerSocket(2007);
			while(true) {	//������ �Ǳ� ���� ���� ����	//��� ������� ������ �� �ְ� client�� ������ �׻� ���� �� �ְ� ����ϴ� ��.
				System.out.println("Ŭ���̾�Ʈ ������ ������Դϴ�.");
				Socket client = server.accept();	//Socket�� ���� �����ߴ����� ���� ������ �˰� �ִ�.
				
				InetAddress ia = client.getInetAddress();	//InetAddress�� �̾ƿ´ٴ� ����
				int port = client.getLocalPort();	//���ӿ� ���� port	//Ŭ���̾�Ʈ�� 2019 ������ �����ϱ� ���� ���� ��Ʈ
				String ip = ia.getHostAddress();	//���� client IP
				System.out.println("~" + port + ip);
				//�ѱ��� ����� �� �ֽ��ϴ�.
				//Client�� ����� ��ü ����.
				BufferedWriter writer = 
				new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));	//OutputStream���� -> 
				
				//���ۿ� ���ڿ��� �����
				writer.write("����ȣ ������ ���� �ϽŰ��� ȯ�� �մϴ�.");
				
				//������ Client�� ������
				writer.flush();
				try {
					client.close();	//���� ����
				}catch(IOException e) {
					System.out.println("~" + e.toString());
				}
			}
		}catch(IOException ioe) {
			System.err.println("Exception generated");
		}finally {
			try {
				server.close();
				System.out.println("���� �۵��� �����մϴ�.");
			}catch(IOException e) {
				System.out.println("ServerSocket�� �ݴ� �� ������ �����ϴ�." + e);
			}
			//�ƹ�Ű�� ���� ������ ����մϴ�.
			try {
				InputStream is = System.in;
				is.read();
			}catch(Exception e) {
				
			}
			System.out.println("���� ���α׷� ������ �����մϴ�.");
		}
	}
}