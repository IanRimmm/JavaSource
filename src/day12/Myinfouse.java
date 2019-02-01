package day12;

public class Myinfouse {
	
	/*
	 @param args
	 */
	public static void main(String[] args) {
		// upcasting
		Myinfointer info = new Myinfo("아로미","010-0101-0101", "인천시 남구동", 35);
		
		System.out.println("이름 : "+ info.getName());
		System.out.println("전화 : "+ info.getPhone());
//		System.out.println("주소 : "+ info.getAddredss);
//		System.out.println("나이 : "+ info.getAge());
	}
}

interface Myinfointer{
	String getName();
	String getPhone();
}

class Myinfo implements Myinfointer{
	private String name;
	private String phone;
	private String address;
	private int age;
	
	//기본생성자
	Myinfo(){}
	//파라매터생성자
	Myinfo(String name, String phone, String address, int age){
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.age = age;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		return age;
	}
}