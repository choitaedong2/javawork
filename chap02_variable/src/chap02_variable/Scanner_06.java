package chap02_variable;

import java.util.Scanner;

public class Scanner_06 {
		public static void main(String[] args) throws Exception {
			Scanner scan = new Scanner(System.in);
			
			/*
			// System.in 사용시 : 사용자에게 무억을 해야되는지 써주는 것이 좋다.
			System.out.println("정수 입력 : ");
			// 정수형으로 받을 때 nextInt()
			int num1 = scan.nextInt();
			System.out.println(num1);
			
			System.out.println("이름 입력 : ");
			// 문자열로 받을 때 next()
			String name = scan.next(); // 1개의 문자열
			// Spacebar 기준으로 한개의 문자열로 취급 ex) 홍 길동 = 2, 홍길동 = 1
			System.out.println("이름 : " + name);

			// 기타(boolean, double etc...)
			// 논리형으로 받을 때 nextBoolean()
			System.out.print("당신은 학생 입니까? : ");
			boolean student = scan.nextBoolean();
			System.out.println("당신의 답은 : " + student);
			
			// 실수형으로 받을 때 nextDouble()
			// 문자열의 한 문장을 얻어 올 때 nextLine() : Enter를 칠 때까지
			scan.nextLine();
			
			// 24줄의 enter가 들어옴 nextLine()을 중간에 사용할 때는 한번 더 써줘서 앞의 enter를 넣어줌
			// 혹은 맨 첫줄에 넣을때는 상관없음
			System.out.print("주소 입력 : ");
			
			// System.out.println("주소 입력 : ");
			// scan.nextLine();
			
			String address = scan.nextLine();
			System.out.println("주소는 : "+address);
			
			System.out.print("성의 이니셜 1글자 입력 : ");
			// 문자열: 1글자 이상에서 1글자만 가져오기 위한 인덱스 추가
			// num1 자리의 값을 가져온다
			// char initial = scan.next().charAt(num1);
			char initial = scan.next().charAt(0);
			System.out.println("성의 이니셜은 : "+ initial);
			
			*/
			
//			System.out.println("정수 3개 입력(띄어쓰기로) >> ");
//			int num1 =scan.nextInt();
//			int num2 =scan.nextInt();
//			int num3 =scan.nextInt();
//			
//			System.out.println("정수 1 : "+num1);
//			System.out.println("정수 2 : "+num2);
//			System.out.println("정수 3 : "+num3);
			
			// 레포트
			/*
			 * 1. 사용자로부터 2수를 입력 받아 사칙연산을 출력하시오.
			 * 2. 사용자로 부터 연산자(1글자)를 입력 받아 위 1번의 두 수를 연산하여 출력하시오
			 */
			
			Outter:
			// 반복문 중지를 위한 throws Exceoption으로 예외처리 라벨링
			
			System.out.println("Q1.");
			System.out.println("정수 2개 입력(띄어쓰기로) >> ");
			int sol1 = scan.nextInt();
			int sol2 = scan.nextInt();			
			int answer;
			System.out.println("산술 연산자 입력(+,-,*,/,%) >> ");
			String sol3;
			sol3 = scan.next();
			
			if(sol3.equals("+")) {
				answer = sol1 + sol2;
				System.out.println("결과 값 : " + answer);
			}
			
			else if(sol3.equals("-")) {
				answer = sol1 - sol2;
				System.out.println("결과 값 : " + answer);
			}
			
			else if(sol3.equals("*")) {
				answer = sol1 * sol2;
				System.out.println("결과 값 : " + answer);
			}
			
			else if(sol3.equals("/")) {
				answer = sol1 / sol2;
				System.out.println("결과 값 : " + answer);
			}
			
			else if(sol3.equals("%")) {
				answer = sol1 % sol2;
				System.out.println("결과 값 : " + answer);
			}
			else {
				System.out.println('"'+ sol3 + '"' + "은 잘못된 산술 연산자 입니다.");
			}
			scan.close();
		}
}
