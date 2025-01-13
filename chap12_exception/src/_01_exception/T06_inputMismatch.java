package _01_exception;

import java.util.Scanner;
import java.util.InputMismatchException;

// InputMismatchException : 사용자로부터 입력(Scanner) 받을 때 자료형이 맞지 않을 때
public class T06_inputMismatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력 : ");
		/*
		 * try { int sum = 0; for(int i = 1; i<=3; i++) { System.err.print(i +
		 * "번째 정수 입력 : "); int num = sc.nextInt(); sum += num; } }
		 * catch(InputMismatchException ime) { System.out.println("정수만 입력 가능"); }
		 */		
		int sum = 0;
		for(int i = 1; i<=3; i++) {
			System.err.print(i + "번째 정수 입력 : ");
			try {
				int num = sc.nextInt();
				sum += num;
			} catch(InputMismatchException ime) {
				System.out.println("정수만 입력 가능");
				sc.next(); // next는 포인터의 위치를 나타내는 것이므로 하나를 추가하여 정상 구문으로 작동하도록 만듬
				i--;
			}
			
		}
		System.out.println("합계 : " + sum);
	}

}
