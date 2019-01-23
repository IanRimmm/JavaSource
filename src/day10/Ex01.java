package day10;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Korean kor = new Korean("이지훈", 30, "남자", "한국", false);
		American ame = new American("Ian", 21, "남자", "USA", true);
		Person3 per = new Person3("무국적자", 25, "남자", "없음");
		
		System.out.println(ame.isEnglish());	//true
		Person3 aper = ame; //업캐스팅
		
//		System.out.println(aper.isEnglish());  업캐스팅 시에는 자식 객체 내 접근 불가!
		
		American ame2 = (American) aper; //다운캐스팅
		System.out.println(ame2.isEnglish());	//true
		System.out.println("---------------");	
	
		Ex01.printInfo(kor);
		Ex01.printInfo(ame2);
		Ex01.printInfo(per);
		
		Ex01.printInfo2(kor);
		Ex01.printInfo2(ame2);
		Ex01.printInfo2(per);
	}
	
	public static void printInfo(Person3 person) {
		System.out.println(
				person.getName() + "\n" +
				person.getAge() + "\n" +
				person.getGender() + "\n" +
				person.getNation() + "\n" +
				"-----------"
				);
	}
	
	public static void printInfo2(Person3 person) {
//		if(person == Korean)
//		instanceof 해당 객체의 클래스 형을 판단함
		if(person instanceof Korean) {
			Korean k = (Korean) person;
			System.out.println(
					k.getName() + "\n" +
					k.getAge() + "\n" +
					k.getGender() + "\n" +
					k.getName() + "\n" +
					k.isMilitary() + "\n" +
					"-----------"
					);
		}else if(person instanceof American) {
			American a = (American) person;
			System.out.println(
					a.getName() + "\n" +
					a.getAge() + "\n" +
					a.getGender() + "\n" +
					a.getName() + "\n" +
					a.isEnglish() + "\n" +
					"-----------"
					);
		}else {
			System.out.println(
					person.getName() + "\n" +
					person.getAge() + "\n" +
					person.getGender() + "\n" +
					person.getNation() + "\n" +
					"-------------"
					);
		}
	}
	
	
}


class Person3{
	private String name;
	private int age;
	private String gender;
	private String nation;
	
	public Person3(String name, int age, String gender, String nation) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.nation = nation;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age	) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getNation() {
		return nation;
	}
}


class Korean extends Person3{
	private boolean military;
	
	public Korean(String name, int age, String gender, String nation, boolean military) {
		super(name, age, gender, nation);	//super();의 경우 부모의 참조값을 나타낸다!
		this.military = military;
	}
	
	public void setMilitary(boolean military) {
		this.military = military;
	}
	public boolean isMilitary() {
		return military;
	}
}


class American extends Person3{
	private boolean english;
	
	public American(String name, int age, String gender, String nation, boolean english) {
		super(name, age, gender, nation);
		this.english = english;
	}
	
	public void setEnglish(boolean english) {
		this.english = english;
	}
	public boolean isEnglish() {
		return english;
	}
}