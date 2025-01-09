package _04_staticEx;
/*
 Produnt
 	고유의 제품번호
 	제품의 갯수(객체가 생성된 갯수)
 */
public class Product {
	String serial;
	static int serial_no;
	static int stock;

	Product() {
		System.out.printf("고유한 제품 번호 : (더조은%d)\n", ++serial_no);
		this.stock++;
	}
	static int getStock(){
		System.out.println("생성된 총 제품의 갯수 : " + stock);
		return stock;
	}
	static int resetStock() {
		System.out.println("생성된 총 제품의 갯수를 리셋합니다.");
		return stock=0;
	}
}
