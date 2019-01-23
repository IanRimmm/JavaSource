package test.day06;

import java.util.Scanner;

class Goods{
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	//������(�����ڴ� Ŭ������� ����, ���ϰ��� ����)�� �ϴ� �� - �ʵ�(�������)�� �ʱ�ȭ
	Goods(String name, int price, int numberOfStock, int sold){//������
		this.name = name;									   //setter�� �����ڰ� ����� �� �ִ�.
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	String getName() {	//setName�� ���?
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
		Goods[] goodsArray;	//goodsArray�� ��������
		goodsArray = new Goods[3];	// Goods[] goodsArray = new Goods[3];	// ��ü������ �ƴ� �ܼ��� �迭�� �����ϴ� ��!
									// Goods[3] �ǹ� : Goods[0] ~ Goods[3]
		for(int i=0;i<goodsArray.length;i++) {
			Scanner s = new Scanner(System.in);
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			int sold = s.nextInt();
			goodsArray[i] = new Goods(name, price, n, sold); //��ü ����
		}
		
		for(int i=0;i<goodsArray.length;i++) {
			System.out.print(goodsArray[i].getName()+" "); //��ǰ �̸� ���
			System.out.print(goodsArray[i].getPrice()+" "); //��ǰ ���� ���
			System.out.print(goodsArray[i].getNumberOfStock()+" "); //��ǰ ��� ���
			System.out.println(goodsArray[i].getSold()+" "); //�ȸ� ���� ���
		}
	}
}
