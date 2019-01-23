package day09;

public class MovieTest {
	public static void main(String[] args) {
		Korea k = new Korea();
		System.out.println("장르:"+k.part);
		System.out.println("제목:"+k.m1);
		
		Foreign f = new Foreign();
		System.out.println("장르:"+f.part);
		System.out.println("제목:"+f.m1);
	}
}

class Movie{
	String part = "영화";
}

class Korea extends Movie{ //part변수 상속
	String m1 = "가문의위기";
}

class Foreign extends Movie{
	String m1 = "박물관이 살아있다.";
}

/*
 K	orea k의 "object - Movie - Korea"의 hashcode는 1개이다.
*/