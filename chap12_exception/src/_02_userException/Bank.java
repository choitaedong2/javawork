package _02_userException;
/*
 Bank
 	private 잔액 : 필드
 	입금(deposit) 메서드
 	출금(withdrawal) 메서드(잔액보다 많이 찾으면 안됨)
 		getter 메서드 잔액
 */
public class Bank {
	private int count;
	
	public void depositCount(int count) {
		System.out.printf("계좌에 '%d'를 입금합니다\n", count);
		this.count += count;
	}
	
	public void withdrawalCount(int count) throws UserException {
		if(this.count >= count) {
			System.out.printf("계좌에 '%d'를 출금합니다\n", count);
			this.count -= count;
		}
		else 
			throw new UserException("잔고부족 : "+(this.count-count) + "모자람");
	}
	
	public void getCount() {
		System.out.println("잔액 : " + this.count);
	}
}
