package _01_conditional;

import java.util.Scanner;

public class T05_switch {

	public static void main(String[] args) {
		// switch ~ case 문
		/*
		 switch(변수) {
		 	case 1 : 
		 		변수에 들어있는 값이 1일때 실행;
		 		break;
		 	case 2 :
		 		변수에 들어있는 값이 2일때 실행;
		 		break;
		 		
		 	default :
		 		변수에 들어있는 값이 1,2를 제외한 나머지 숫자일 때 실행;
		 }
		 */
		
		int num = 2;
		switch(num) {
			case 1:
				System.out.println("1입니다.");
				break;
			case 2:
				System.out.println("2입니다.");
				break;
			case 3:
				System.out.println("3입니다.");
				break;
				default:
					System.out.println("1,2,3을 제외한 다른 숫자");
		}
		System.out.println("switch문을 빠져나옴");
		
		char ch = 'l';
		switch(ch) { // break가 없으면 case 상관없이 조건이 부합한 case부터 하위 내용 전부 실행
			case 'k':
				System.out.println("김씨입니다.");
//				break;
			case 'l':
				System.out.println("이씨입니다.");
//				break;
			case 'p':
				System.out.println("박씨입니다.");
//				break;
			default:
				System.out.println("성이 김,이,박씨가 아닙니다.");
		}
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("몇 월생인지 입력하십시오");
//		
//		int month = sc.nextInt();
//		if (month > 12 || month <= 0) {
//			System.out.println("잘못된 입력값 입니다. 1월~12월을 입력해 주십시오.");
//			int new_month = sc.nextInt();
//			month = new_month;
//		}
//		
//		switch(month) {
//			case 1:
//			case 2:
//			case 12:
//				System.out.println("겨울에 태어났군요");
//			case 3: case 4: case 5:
//				System.out.println("봄에 태어났군요");
//			case 6: case 7:
//			case 8:
//				System.out.println("여름에 태어났군요");
//			default:
//				System.out.println("가을에 태어났군요");
//		}

		// 문) 	연산할 두 숫자와 연산자(+,-,*,/,%)를 입력 받아
		// 		연산한 두 결과 출력
		
		System.out.println("연산에 필요한 두 숫자(정수)와 연산자를 입력해 주십시오.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char carculate = sc.next().charAt(0);
		double re = 0;
		
		if (carculate == '%' && (num1 <0 || num2 <0) ) {
			System.out.println("음수는 몫을 구할 수 없습니다.");
		}
		else if (carculate == '+' || carculate == '-' || carculate == '*') {
			switch(carculate) {
				case '+':
					re = num1 + num2;
					break;
				case '-':
					re = num1 - num2;
					break;
				case '*':
					re = num1 * num2;
					break;
				case '%':
					re = num1 % num2;
					break;
			}
			System.out.printf("연산 '%s'에 대한 결과는 : %d", carculate, (int)re);
		}
		else if (carculate == '/' || carculate == '%') {
			switch(carculate) {
				case '/':
					double re2 = (double)num1 / num2;
					re = re2;
			}
			System.out.printf("연산 '%s'에 대한 결과는 : %.2f", carculate, re);
		}
		else
			System.out.println("잘못된 연산자를 입력하셨습니다.");
	}

}
