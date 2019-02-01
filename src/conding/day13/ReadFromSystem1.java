package conding.day13;

/*
 - System.in.read()를 이용합니다.
 - 문자를 여러번 받아 문자열로 만드는 법을 배운다.
 - new String(byte 배열,시작,끝-2); \n, \r이 붙어있어서 뺌
 */
public class ReadFromSystem1 {

	public static void main(String[] args) {

		byte[] b = new byte[1024];
		int len = 0;
		try {
			System.out.println("데이타를 입력하세요.");
			len = System.in.read(b); // 섹션 102 //read를 하게되면 몇 개 입력했는지를 len으로 해주겠다?뭐
			System.out.println(len);
		} catch (Exception e) {
			System.out.println("입력실패");
		}
		String str = new String(b, 0, len - 2);
		System.out.println(str);
		try {
			System.out.println("데이타를 입력하세요.");
			len = System.in.read(b);
			System.out.write(b, 0, len);
			System.in.close();
		} catch (Exception e) {
			System.out.println("입력실패");
		}
	}
}