package _03_repetitive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		/*
		 * while(조건식) {
		 		조건식이 참인동안 계속 실행
		 	}
		 */
		// for문을 while문으로
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println("===========");
		int i =1;
		while(i<=5) {
			System.out.println(i);
			i ++;
		}
		System.out.println("===========");
		
		// 1~10까지의 합계 (while문으로)
		i = 1;
		int sum = 0;
		while(i<=10) {
			sum += ++i;
		}
		System.out.println("1~10까지 합계 : "+sum);
		System.out.println("===========");
		
		// break
//		int count = 0;
//		while(true) {
//			System.out.println(++count);
//			if(count==5) {
//				break;
//			}
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("문자 1개(멈추려면 'q') 입력 : ");
//			char ch = sc.next().charAt(0);
//			if(ch =='q')
//				break;
//			System.out.println(ch);
//		}
//		sum = 0;
//		int j = 0;
//		for(j=1; j<=10; j++) {
//			sum += j;
//			
//			if (sum >=10)
//				break;
//		}
//		System.out.println(j+"까지의 합 : "+sum);
//		System.out.println("===========");
		
		//continue
		// 1~100까지의 합계 중 3의 배수를 제외한 합계 구하기
		// 1+2+4+5+7+8+10+...
		sum = 0;
		for(int j=0; j<=20; j++) {
			if(j%3 ==0) {
				continue;
			}
			sum +=j;
		}
		System.out.println("1~100까지 3의 배수를 제외한 합계 : "+sum);
		
	}

}
