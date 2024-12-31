package _01_conditional;

import java.util.Scanner;

public class T03_multi_if {

	public static void main(String[] args) {
		/*
		 if 문을 여러번 사용
		 
		 if(조건식) {
		 	조건식이 참일 때 실행되는 구문
		 } else if(조건식1) {
		 	조건식1이 참일 때 실행되는 구문
		 } else if(조건식2) {
		 	조건식2가 참일 때 실행되는 구문
		 } else { // else에는 조건을 달 수 없음
		 	조건식2가 거짓일 때 실행되는 구문
		 }
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		if (score>100 || score <0) {
			System.out.println("잘못된 값 입니다. 0~100사이의 올바른 점수를 입력해 주십시오.");
			score = sc.nextInt();
		}
		else if (score>=90)
			System.out.println("A학점");
		else if (score >= 80)
			System.out.println("B학점");
		else if (score >= 70)
			System.out.println("C학점");
		else if (score >= 60)
			System.out.println("D학점");
		else
			System.out.println("F학점");
		System.out.println("---------------------------------------------------");
	}

}
