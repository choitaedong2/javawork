package _02_polyBuyer;

public class Product {
	int price;
	int bonusPoint;
	// 생성자(price)
	Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price*0.05);
	}
}