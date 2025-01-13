package _02_userException;

import java.util.Scanner;

public class Ex01_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex01 ex = new Ex01();
		double num1 = -1, num2 = -1;
		System.out.println("덧 셈에 필요한 두 수를 입력하시오");
		
//		while(num1<0 || num2<0) {
			try {
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();	
				ex.sum(num1, num2);
			} catch(UserException e) {
				System.out.println(e.getMessage());
//				sc.next();
//				if(num1<0)
//					num1 = sc.nextDouble();
//				else if(num2<0)
//					num2 = sc.nextDouble();
//				else {
//					num1 = sc.nextDouble();
//					num2 = sc.nextDouble();
//				}
			} catch(Exception e) {
				System.out.println("예외 발생");
			}
//		}
	}

}
