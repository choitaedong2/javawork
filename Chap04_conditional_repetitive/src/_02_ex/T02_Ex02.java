package _02_ex;

import java.util.Scanner;

public class T02_Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Ex01. 1~6의 주사위 숫자를 맞춰주세요");
//		int random = (int)(Math.random()*7);
//		int user_num = sc.nextInt();
//
//		while(random != user_num) {
//			if(user_num > 6 || user_num <0)
//				System.out.println("1~6 사이의 값을 넣어주세요.");
//			else
//				System.out.println("틀렸습니다 다시 입력해주시기 바랍니다.");
//			user_num = sc.nextInt();
//		}
//		System.out.println("정답을 맞춰 종료합니다.");
		
//		System.out.println("============================");
//		
//		System.out.println("Ex02. 구구단 옆으로 출력하기");
//		for(int i=1, j=1; i<=9; i++) {
//			for(j=1;j<=9;j++) {
//				System.out.printf(i+"*"+j+"= "+(i*j)+"\t");
//			}
//			System.out.println();
//		}
		
//		System.out.println("============================");
//		System.out.println("chapter05_Ex01. for문을 이용하여 반복 합계 연산");
//		
//		int sum = 0;
//		outer : for(int i = 5, j=1; sum <= 1050 ;j++) {
//			sum+=(i*j);
//			if(sum==1050) {
//				System.out.println(j+"번째 까지의 합" +sum);
//				break outer;
//			}
//		}
		
//		System.out.println("============================");
//		System.out.println("chapter05_Ex02. for문을 이용하여 반복 합계 연산");
//		
//		int evenSum = 0, oddSum = 0;
//		
//		for (int i=1; i<=100; i++) {
//			if(i%2==0)
//				evenSum +=i;
//			if(i%2==1)
//				oddSum +=i;
//		}
//		System.out.println("[실행결과]");
//		System.out.println("짝수의 합계는"+evenSum);
//		System.out.println("홀수의 합계는"+oddSum);

//		System.out.println("============================");
//		System.out.println("chapter05_Ex03. 두 개의 주사위의 두 눈의 합이 6이 되는 모든 경우의 수를 출력");
//		
//		for (int x=1; x<=6; x++) {
//			for (int y=1; y<=6; y++) {
//				if(x+y==6)
//					System.out.printf("(%d, %d)\n", x, y);
//			}
//		}
		
//		System.out.println("============================");
//		System.out.println("chapter05_Ex04. 이중 for 문을 이용하여 보기와 같은 실행 결과 출력");
//		
//		for(int i = 1; i<=5;i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.printf("%s",'*');
//			}
//			System.out.println();
//		}
		
//		System.out.println("============================");
//		System.out.println("chapter05_Ex05. 이중 for 문을 이용하여 보기와 같은 실행 결과 출력");
//		
//		for(int i = 1; i<=5;i++) {
//			for(int j=5; j>=i; j--) {
//				System.out.printf("%s",'*');
//			}
//			System.out.println();
//		}
		
		System.out.println("============================");
		System.out.println("chapter05_Ex06. 이중 for 문을 이용하여 보기와 같은 실행 결과 출력");

		for(int i = 1; i<=9;i+=2) {
			for(int h=8; h>=i; h-=2) {
				System.out.printf("%s",' ');
			}
			for(int j=1; j<=i; j++) {
				System.out.printf("%s",'*');
			}
			System.out.println();
		}
		
//		System.out.println("============================");
//		System.out.println("chapter05_Ex07. 주사위의 눈이 6이 나올때까지 반복해서 굴린 총 횟 수");
//		
//		int num1 = (int) (Math.random()*7), i=1;
//		if(num1==6) {
//			System.out.printf("(%s)\n", num1);
//			System.out.println("총 주사위 굴린 횟수는 : " + i);
//		}
//		else {
//			while(num1 != 6) {
//				i++;
//				System.out.printf("(%s)\n", num1);
//				num1 = (int) (Math.random()*7);
//			}
//			System.out.printf("(%s)\n", num1);
//			System.out.println("총 주사위 굴린 횟수는 : " + i);
//		}
	}

}
