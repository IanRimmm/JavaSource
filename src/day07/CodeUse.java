package day07;
class Code{
	public String getArea(int index) {	// Call by Value
		// 1���� �迭
		String[] areas = {"����", "õ��", "����", "�뱸", "����", "����"};
		
		return areas[index-1];	// String return
		
	}
}
public class CodeUse {
	public static void main(String[] args) {
		Code co = new Code();
		String area = co.getArea(6);
		
		System.out.println(area);	// areas[5] ��, "����"�� ��µ�!
	}
}
