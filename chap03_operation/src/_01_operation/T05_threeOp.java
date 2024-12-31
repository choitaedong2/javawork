package _01_operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
		// 삼항연산자
		/*
		 조건식 ? 조건이 참일 때 실행 : 조건이 거짓일 때 실행
		 */
		Scanner sc = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = 7;
		
		String result = num1 < num2 ? "num1의 숫자가 더 작다" : "num1의 숫자가 더 크다";
		System.out.println(result);
		
		char re1 = num1 < num2 ? '小' : '大';
		System.out.print("num2의 숫자는 num1의 숫자보다 : ");
		System.out.println(re1);
		
		if(num1 < num2) {
			System.out.println("작동중? "+num2);
		}
		else if (num1 > num2) {
			System.out.println("작동중? "+num1);
		}
		
		// num3의 값을 절대값으로 변경하기
		int num3 = -8;
		int re2 = num3 < 0 ? Math.abs(num3) : num3;
		System.out.println(re2);
		
		// 사용자로 부터 점수를 입력받아
		// 80점 이상이면 합격 그렇지 않으면 불합격을 출력하기
//		System.out.println("귀하의 점수를 입력해 주십시오.");
//		int score = sc.nextInt();
//		String re3 = score >= 80 ? "합격입니다.":"불합격입니다." ;
//		System.out.printf("귀하는 %d점으로 %s\n", score, re3);
		
		System.out.println("귀하의 점수를 입력해 주십시오.");
		int score = sc.nextInt();
		
		String re4 = 
				score < 0 || score > 100 ? "입력 가능한 범위를 벗어났습니다." :
				score >= 90 ? "'A' 등급입니다." :
				score >= 80 ? "'B' 등급입니다." :
				score >= 60 ? "'C' 등급입니다." :
				score >= 40 ? "'D' 등급입니다." :
				score >= 20 ? "'E' 등급입니다." : "'F' 등급입니다.";
		System.out.printf("입력하신 %d점수는 %s\n", score, re4);
		
		System.out.printf("-----------------------------------------------\n");
		
	}

}
