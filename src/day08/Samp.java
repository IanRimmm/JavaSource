package day08;
	
public class Samp {
	int id; //�ڵ��ʱ�ȭ
	
	Samp(){	//������ �����ε� �׽�Ʈ.
		
	}
	Samp(int id){//�Ű�����������
		this.id	= id;
	}
	
	public void set(int id) {
		this.id = id;
	}
	
	public int get() {
		return id;
	}
	
	public static void main(String[] args) {
		Samp ob1 = new Samp(3);
		System.out.println(ob1.get());
			
		Samp ob2 = new Samp();
		ob2.set(10);	//settf
		System.out.println(ob2.get());
	}
}
