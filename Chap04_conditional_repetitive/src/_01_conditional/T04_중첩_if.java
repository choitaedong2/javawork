package _01_conditional;

import java.util.Scanner;

public class T04_중첩_if {

	public static void main(String[] args) {
		/*
		 중첩 if ans
		 if(바깥 조건식) {
		 	바깥 조건식이 참일 때 실행할 구문
		 		if(안의 조건식) {
		 			안의 조건식 참일 때 실행할 구문
		 		} else {
		 			안의 조건식 거짓일 때 실행할 구문
		 		}
		 } else {
		 	바깥 조건식이 거짓일 때 실행할 구문
		 }
		 */
		
		int num1 = 84;
		if(num1>100) { // 100보다 큰 모든 수
			if(num1 > 200) { //200보다 큰 모든 수
				System.out.println("200보다 큰 숫자");
			} else { // 200보다 작은수 이면서 100보다 큰 수
				System.out.println("100보다 크고 200보다 작은수");
			}
		} else { // 100보다 작은 모든 수
			if(num1>0 ) { // 100~1
				System.out.println("양수");
				if(num1 %2 ==0) {
					System.out.println("짝수");
				} else {
					System.out.println("홀수");
				}
			} else if(num1 ==0) {
				System.out.println("0");
			} else {
				System.out.println("음수");
				if(num1 %2 ==0) {
					System.out.println("짝수");
				} else {
					System.out.println("홀수");
				}
			}
		}

	}

}
