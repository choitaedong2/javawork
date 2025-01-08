package _03_bank;

import java.util.Scanner;

public class Bank_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		System.out.println("현재 계좌 잔액은 : "+b.getCount());
		System.out.println("=============================");
		
		b.depositCount(500);
		System.out.println("현재 계좌 잔액은 : "+b.getCount());
		System.out.println("=============================");
		
		b.withdrawalCount(700);
		System.out.println("현재 계좌 잔액은 : "+b.getCount());
		System.out.println("=============================");
		
		b.withdrawalCount(10000000);
		System.out.println("=============================");
		
		/*
		 int input
		 int money;
		do {
			
			System.out.println("할 업무를 선택해 주십시오.");
			System.out.println("1: 입금, 2: 출금, 3: 잔액확인, 0: 끝내기");
			int input = sc.nextInt();
			switch(input) {
			case 1 :
				System.out.println("입금할 금액을 넣으세요 : ");
				money = sc.nextInt();
				b.depositCount(money);
				break;
			case 2 :
				System.out.println("출금할 금액을 넣으세요 : ");
				money = sc.nextInt();
				b.withdrawalCount(money);
				break;
			case 3 :
				System.out.println("현재 계좌 잔액은 : "+b.getCount());
				break;
			case 0 :
				System.out.println("은행 업무를 종료합니다.");
				break;
			}
			System.out.println();
		} while(input !=0);
		*/
	}

}