package test.day06;

import java.util.Scanner;

class Goods{
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	//생성자(생성자는 클래스명과 같고, 리턴값이 없다)가 하는 일 - 필드(멤버변수)의 초기화
	Goods(String name, int price, int numberOfStock, int sold){//생성자
		this.name = name;									   //setter는 생성자가 대신할 수 있다.
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	String getName() {	//setName은 어디에?
		return name;
	}
	int getPrice() {
		return price;
	}
	int getNumberOfStock() {
		return numberOfStock;
	}
	int getSold() {
		return sold;
	}
}

public class GoodsArray {
	public static void main(String[] args) {
		Goods[] goodsArray;	//goodsArray는 지역변수
		goodsArray = new Goods[3];	// Goods[] goodsArray = new Goods[3];	// 객체생성이 아닌 단순히 배열만 생성하는 것!
									// Goods[3] 의미 : Goods[0] ~ Goods[3]
		for(int i=0;i<goodsArray.length;i++) {
			Scanner s = new Scanner(System.in);
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			int sold = s.nextInt();
			goodsArray[i] = new Goods(name, price, n, sold); //객체 생성
		}
		
		for(int i=0;i<goodsArray.length;i++) {
			System.out.print(goodsArray[i].getName()+" "); //상품 이름 출력
			System.out.print(goodsArray[i].getPrice()+" "); //상품 가격 출력
			System.out.print(goodsArray[i].getNumberOfStock()+" "); //상품 재고 출력
			System.out.println(goodsArray[i].getSold()+" "); //팔린 수량 출력
		}
	}
}
