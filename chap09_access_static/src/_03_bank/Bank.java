package _03_bank;
/*
 Bank
 	private 잔액 : 필드
 	입금(deposit) 메서드
 	출금(withdrawal) 메서드(잔액보다 많이 찾으면 안됨)
 		getter 메서드 잔액
 */
public class Bank {
	private int count = 1000000;
	
	void depositCount(int count) {
		System.out.printf("계좌에 '%d'를 입금합니다\n", count);
		this.count += count;
	}
	
	void withdrawalCount(int count) {
		if(this.count < count) {
			System.out.println("계좌 잔액이 부족합니다.");
			System.out.printf("현재 출근 가능한 계좌 잔액은 %d입니다.\n", this.count);
		}
		else {
			System.out.printf("계좌에 '%d'를 출금합니다\n", count);
			this.count -= count;
		}
	}
	
	int getCount() {
		return count;
	}
}
