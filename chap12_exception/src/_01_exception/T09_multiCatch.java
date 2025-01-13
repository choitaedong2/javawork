package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * try 안에 여러개의 예외가 발생할 경우
 	- 예외의 갯수만큼 catch문 사용할 수 있다
 	  : 이때 catch 첫번째 부터 차례대로 본인의 예외의 클래스인지 확인 후 맞은 예외처리
 		아니면 다음번 catch문으로 내려간다
 */
// ArithmeticException : 0으로 나눌수 없을때 오류
public class T09_multiCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나누기할 정수 2개 입력 : ");
		
		try {
			int num1 = sc.nextInt(); // inputMissmatch 오류 가능성
			int num2 = sc.nextInt();
			System.out.println("몫 : " + num1/num2); // arithmetic 오류 가능성
			System.out.println("나머지 : " + num1%num2);
			
			int[] num = {1,2,3};
			System.out.println(num[3]);
			
		}catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
			ae.printStackTrace(); // 호출스택에 있는 메서드 정보와 예외 메시지 화면 출력
			System.out.println("예외 메시지 : " + ae.getMessage()); // 예외클래스 인스턴스에 저장된 메시지 출력
		}catch(InputMismatchException im) {
			System.out.println("정수만 입력 가능");
		}catch(Exception e) { // Exception은 가장 상위 부모로 모든 예외를 처리함
			// 맨 마지막에 씀
			System.out.println("예외 발생");
		}
	}

}
