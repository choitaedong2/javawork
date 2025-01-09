package _02_polyBuyer;

public class Buyer {
	int money = 500;
	int bonusPoint;
	// 생성자(price)
	
	/* 제품의 갯수만큼 오버로딩 해야함
	void buy(Computer com) {
		
	}
	void buy(Tv tv) {
		
	}
	void buy(GameDevice gd) {
		
	}
	*/
	// 형변환을 하면 모든 제품을 다 받을 수 있다.
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입함");
	}
}