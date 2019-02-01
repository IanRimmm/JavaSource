package conding.day12;

public class Overriding {
	public static void main(String[] args) {
		Professor a = new Professor();
		a.setPhone("010-0101-0101");//Professor의 getPhone() 호출(오버라이딩된 메소드 호출)
		System.out.println(a.getPhone());
		
		Person p = a;	//업캐스팅
		System.out.println(p.getPhone());//동적바인딩에 의해 Professor의 getPhone호출
	}
}

class Person{
	String phone;
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
}

class Professor extends Person{
	public String getPhone() {//Person의 getPhone()을 오버라이딩
		return "Professor : " + super.getPhone(); //Person의 getPhone()을 호출
	}
}