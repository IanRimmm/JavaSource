package day06;
/* 
 * ������ Ŭ����
 */
class Pay{
	//��� ����, �ν���Ʈ ����, �ʵ�
	String name; //����, ���ڿ� ����	// private String name;
	int bonbong; //����, ����
	int tax; //����, ����
	int silsu; //�Ǽ��ɾ� ����  - ����, ����
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {		// private���� ��������� �����־��� ��쿡��,
		return name;				// set & get�� ���־���Ѵ�!!
	}
	
	public void setBonbong(int bonbong) {
		this.bonbong = bonbong;
	}
	
	public int getBonbong() {
		return bonbong;
	}
/*
 * ������ �̿� Ŭ����, ���� Ŭ����
 */
	//2019��1��17�� ����Ͽ� �߰� ������ �۾�.	- �Ű����� �ִ� ������ �����, �⺻������ ���� �ʼ�!
	public Pay() {}
	public Pay(int bonbong, String name) {
		this.bonbong = bonbong;
		this.name = name;
	}
	
	public int taxCalc() {	// public+����Ÿ��+�޼ҵ����&[�빮��]��Ӻ�����(�Ķ��Ÿ)_ī��ǥ���	//�޼ҵ�()�� ¦��!!
		return (int)(bonbong*0.045 + 0.5);	//�������� �����س��� ����Ÿ���� �����־�� �Ѵ�.
	}
	
	public int silsuCalc() {
		return bonbong - tax;
	}

	public void payPrint() {	// void�� return���� ����!
		System.out.println("----------------");
		System.out.println("---12�� �޿� ����---");
		System.out.println("----------------");
		System.out.println("���� : "+name);
		System.out.println("���� : "+bonbong);
		System.out.println("���� : "+tax);
		System.out.println("�Ǽ��ɾ� : "+silsu);
	}
}


class Allowance extends Pay{
	private int year;
	private int child;
	
	Allowance(){
	}
	Allowance(int year, int child, int bonbong, String name){
		setName(name);
		setBonbong(bonbong);
		this.year = year;
		this.child = child;
	}
	
	public void setyear(int year) {
		this.year = year;
	}
	public int getyear() {
		return year;
	}
	
	public void setchild(int child) {
		this.child = child;
	}
	public int getchild() {
		return child;
	}
	
	public int getAllowance() {
		int allowance = 0;
		
		if(year==0) {
			System.out.println("���Ի���Դϴ�");
		}else if(year==1) {
			allowance = 200000;
			System.out.println("���1���Դϴ�.");
		}else if(year==2) {
			allowance = 400000;
			System.out.println("���2���Դϴ�.");
		}
		else if(year==3) {
			allowance = 600000;
			System.out.println("���3���Դϴ�.");
		}
		else if(year==4) {
			allowance = 800000;
			System.out.println("���4���Դϴ�.");
		}
		
		if(year >=1) {
			if(child>1) {
				allowance = allowance + (child*200000);
			}
		}
		return allowance;
	}
	@Override
	public void payPrint() {	// void�� return���� ����!
		System.out.println("----------------");
		System.out.println("---12�� �޿� ����---");
		System.out.println("----------------");
		System.out.println("���� : "+getName());
		System.out.println("���� : "+getBonbong());
		System.out.println("���� : "+taxCalc());
		System.out.println("���� : "+getAllowance());
		System.out.println("�Ǽ��ɾ� : "+silsuCalc());
	}
	@Override
	public int silsuCalc() {
		// TODO Auto-generated method stub
		return getBonbong() + getAllowance() - taxCalc();
	}
	
}


public class PayCalc {
	
	public static void main(String[] args) {
		Allowance a1 = new Allowance();
		a1.setBonbong(4000000);
		a1.setName("�ڱ浿");
		a1.setyear(3);
		a1.setchild(1);
		a1.payPrint();
		
		Allowance a2 = new Allowance(5, 2, 3000000, "�̱浿"); //Allowance ctrl + spacebar
		
		
		Pay p1 = new Pay();	// �޸� �Ҵ�(heap memory)
		Pay p2 = new Pay();
		Pay p3 = new Pay();	// p1,p2,p3�� ��ü, ��ü����
		
		p1.bonbong = 2000000;	// private�� ���� ��, p1.setBonbong(2000000);���� �ϸ� �ȴ�.
		p1.name ="�մ���";	// p1.���� ���� ����� ��, �ﰢ���� ��������̴�.	
		p1.tax = p1.taxCalc();	// ���� �޼ҵ带 ȣ���� ���� �ؽ��ڵ�� �������־��� �ϹǷ�, .�� ���־���Ѵ�.
		p1.silsu = p1.silsuCalc();
				
		p2.bonbong = 2500000;
		p2.name	= "�Ʒι�";
		p2.tax = p2.taxCalc();
		p2.silsu = p2.silsuCalc();
		
		p3.bonbong = 1500000;
		p3.name	= "����";
		p3.tax = p3.taxCalc();			// �̷��� �ϸ� ���� ����! ����� ����, �ۼ��� �����ϴ�.
		p3.silsu = p3.bonbong - p3.tax;	// Ǯ�̰� ������Ƿ�, ��� �� �ڵ� �ϴٰ� �Ǽ��� �� �ִ�.
		
		p1.payPrint();
		p2.payPrint();
		p3.payPrint();
		
		//2019��1��17�� ����Ͽ� �߰������� ������ �۾�
		Pay p4 = new Pay(3500000, "ȫ�浿");
	}
}