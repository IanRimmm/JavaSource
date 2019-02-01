package conding.day13;

public class SmartPhone extends PDA implements MobilePhone, MP3{

		//MobilePhone�� �߻� �޼ҵ� ����
		public boolean sendCall() {
			System.out.println("��ȭ �ɱ�");
			return true;
		}
		public boolean receiveCall() {
			System.out.println("��ȭ �ޱ�");
			return true;
		}
		public boolean sendSMS() {
			System.out.println("SMS ������");
			return true;
		}
		public boolean receiveSMS() {
			System.out.println("SMS �ޱ�");
			return true;
		}
		/* ����ؼ� ������ �ߴ� ������ �����ϱ�?
		 public static void main(String[] args){} �ȿ� �ۼ��ؼ� �׷���. �� �׷��� �� �ɱ�?
		 Multiple markers at this line
	- Syntax error, insert "[ ]" to complete Dimension
	- Syntax error, insert ";" to complete BlockStatements
	- Syntax error on token "sendCall", AnnotationName expected after this token
		 */
		
		//MP3�� �߻� �޼ҵ� ����
		public void play() {
			System.out.println("���� ���");
		}
		public void stop() {
			System.out.println("��� ����");
		}
		
		//�޼ҵ� �߰� ����
		public void scheduler() {
			System.out.println("���� ����");
		}
		public void applicationManager() {
			System.out.println("���ø����̼� ��ġ/����");
		}
		
		public static void main(String[] args) {
			SmartPhone p = new SmartPhone();
			p.sendCall();
			p.play();
			p.calculate(3, 5);
			p.scheduler();
		}
}

interface MobilePhone{
	public abstract boolean sendCall();
	public boolean receiveCall();
	public boolean sendSMS();
	public boolean receiveSMS();
}

interface MP3{
	public void play();
	public void stop();
}

class PDA{
	public int calculate(int x, int y) {
		return x+y;
	}
}