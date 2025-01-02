package _03_repetitive;

import java.util.Scanner;

public class T01_for {

	public static void main(String[] args) {
		/*
		 * 반복문 : 원하는 갯수(또는 조건이 맞을때까지)만큼 반박하여 실행하고자 할 때
		   1. for :원하는 갯수 만큼 반복 실행 // 갯수 설정이 중요
		 	  for(초기식; 조건식; 증감식) {
		 	  	실행문
		 	  }
		   2. while : 조건이 맞을 때까지 반복 실행 // 조건 충족 중요
		   3. do~while
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------");
		for(int i=1; i<=3; i++)
			System.out.println("어서오세요"); // 단일 구문일 경우 {} 생략
		
		System.out.println("--------------------------");
		for(int i=1; i<=3; i++)
			System.out.println(i + ". 어서오세요");
		
		System.out.println("--------------------------");
		for(int i=3; i>=1; i--)
			System.out.println(i + ". 감소");
			
		System.out.println("--------------------------");
		for(int i=1; i<=10; i+=2)
			System.out.println(i + ". i값 출력");
		
		System.out.println("--------------------------");
		int sum = 0;
		for(int i=1; i<=10; i++)
			sum += i;
		System.out.println("i값 모두 더한 값은 : " + sum);
	}

}
