package day02;

public class Sungjuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String name = "¿Õ´«ÀÌ";
		        int kuk = 92;
		        int eng = 88;
		        int mat = 80;
		        int tot = kuk + eng + mat; // ÃÑÁ¡
		        int avg = tot / 3;         // Æò±Õ
		 
		        System.out.println("   ¼ºÀû Ã³¸®   ");
		        System.out.println("---------------");
		        System.out.println("¼º¸í: " + name);
		        System.out.println("±¹¾î: " + kuk);
		        System.out.println("¿µ¾î: " + eng);
		        System.out.println("¼öÇÐ: " + mat);
		        System.out.println("ÃÑÁ¡: " + tot);
		        System.out.println("Æò±Õ: " + avg);
	}

}
