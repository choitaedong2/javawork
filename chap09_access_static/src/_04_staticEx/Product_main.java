package _04_staticEx;

import java.util.Scanner;
/*
 Product p1 = new Product(); // 고유한 제품번호 (더조은1)
 */
public class Product_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Product p1 = new Product(); // 고유한 제품번호 (더조은1)
//		Product p2 = new Product(); // 고유한 제품번호 (더조은2)
//		Product p3 = new Product(); // 고유한 제품번호 (더조은3)
//		출력문 : 생성된 총 제품의 갯수: 3
//		p3.getStock();
		int input;
		do {
			System.out.println("수행하고자 하는 작업을 선택해 주십시오.");
			System.out.println("1: 제품생산, 2: 총 제품 갯수 조회, 3: 제품 갯수 리셋,0: 작업 종료");
			input = sc.nextInt();
			switch(input) {
			case 1:
				new Product();
				break;
			case 2:
				Product.getStock();
				break;
			case 3:
				Product.resetStock();
				break;
			case 0:
				System.out.println("작업을 종료합니다.");
				break;
			}
		} while (input != 0);
	}

}
