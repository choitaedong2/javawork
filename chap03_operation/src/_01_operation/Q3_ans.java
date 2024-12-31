package _01_operation;

import java.util.Scanner;

public class Q3_ans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		// 1. 사용자로부터 정수를 입력받아 양수인지 양수가 아닌지 판별하는 결과 출력
//		System.out.println("정수를 입력해 주십시오.");
//		int q1num1 = sc.nextInt();
//		String re1 = q1num1 > 0 ? "입력 받은 숫자는 양수입니다." :"입력 받은 숫자는 양수가 아닙니다.";
//		System.out.println(re1);
//		
//		// 2. 사용자로부터 정수를 입력받아 양수, 0, 음수 판별하는 결과 출력
//		System.out.println("정수를 입력해 주십시오.");
//		int q2num1 = sc.nextInt();
//		String re2 = q2num1 > 0 ? "입력 받은 숫자는 양의 정수입니다." : 
//			q2num1 == 0 ? "입력 받은 정수는 '0'입니다." : "입력 받은 숫자는 음의 정수입니다.";
//		System.out.println(re2);
//		
//		// 3. 사용자로부터 정수를 입력받아 짝수인지 홀수인지 판별하는 결과 출력
//		System.out.println("정수를 입력해 주십시오.");
//		int q3num1 = sc.nextInt();
//		String re3 = q3num1%2 == 0 ? "입력 받은 숫자는 짝수입니다." : 
//			q3num1%2 == 1 ? "입력 받은 정수는 홀수입니다." : "입력 받은 숫자는 음의 정수로 홀짝을 판단할 수 없습니다.";
//		System.out.println(re3);
//		/*
//		 4. 각 인원수에 따라 사탕을 동일하게 나눠 주려고 한다
//   			사용자로부터 인원수와 사탕의 갯수를 입력받아
//			1인당 동일하게 나눠가진 사탕 개수와
//   			나눠주고 남은 사탕 갯수를 출력하기
//		 */
//		System.out.println("사탕의 개수와 나눠 먹을 사람의 수를 입력해 주십시오.");
//		int q4cnady = sc.nextInt();
//		int q4people = sc.nextInt();
//		int eat = q4cnady/q4people;
//		int left = q4cnady%q4people;
//		System.out.printf("한 사람당 먹을 수 있는 사탕의 개수는 %d개 이며, 사탕 %d개가 남았습니다.\n", eat, left);
//		
//		/*
//		 5. 키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하시오
//			이 때, 성별이 'M'이면 남학생, 'M'아 아니면 여학생으로 출력하시오.
//		2학년 7반 3번 이준기 남학생의 성적은 97.35이다.
//		 */
//		System.out.println("이름, 학년, 반, 번호, 성별(M/F), 성적을 차례대로 입력해 주십시오.");
//		String q5name = sc.next();
//		int q5grade = sc.nextInt();
//		int q5class = sc.nextInt();
//		int q5num = sc.nextInt();
//		char q5sex = sc.next().charAt(0);
//		float q5score = sc.nextFloat();
//		
//		String q5re = q5sex == 'M' ? "남자":
//			q5sex == 'F' ? "여자": "잘못된 성별을 입력한";
//		// 4학년 2반 17번 남자 아무개 학생의 성적은 89.57이다.
//		System.out.printf("%d학년 %d반 %d번 %s %s 학생의 성적은 %.2f이다.\n", q5grade, q5class, q5num, q5re, q5name, q5score);
//		
//		/*
//		 6. 사용자로부터 나이를 입력받아 13세이하이면 어린이
//    		14세~19세 이하이면 청소년
//    		20세 이상이면 성인으로 출력하시오
//		 */
//		System.out.println("나이를 입력해 주십시오.");
//		int q6age = sc.nextInt();
//		String q6re = q6age >=20 ? "성인" :
//			q6age > 20 && q6age > 13 ? "청소년" :
//				q6age > 0 ? "어린이" : "잘못된 입력값 입니다.";
//
//		// 7. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
//		//	세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
//		System.out.println("국어, 영어, 수학 점수를 입력해 주십시오.");
//		int q7kor = sc.nextInt();
//		int q7eng = sc.nextInt();
//		int q7math = sc.nextInt();
//		float q7avg = (float)((q7kor+q7eng+q7math)/3);
//		String q7re =  q7kor >= 40 && q7eng >= 40 && q7math >= 40 && q7avg >= 60 ? "합격" : "불합격";
//		System.out.println(q7re);
//		
//		// 8. 주민번호를 입력받아 남자인지 여자인지 출력하기
//		System.out.println("주민등록 번호를 입력해 주세요.(- 포함)");
//		String q8num1 = sc.next();
//		String q8re1 = q8num1.charAt(7) == 1 || q8num1.charAt(7)== 3 ? "남자" : "여자";
//		System.out.printf("주민번호가 %s인 사람은 뒷자리 첫 수가 %s임으로 %s입니다.", q8num1, q8num1.charAt(7), q8re1);
	
		// 9.  사용자로부터 두 개를 입력 받고(num1, num2에 저장)
		//		또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
		//		아니면 false를 출력하세요. (단, num1은 num2보다 작아야 함)
//		System.out.println("서로 다른 정수 2개 입력하세요");
//		int q9num1 = sc.nextInt();
//		int q9num2 = sc.nextInt();
//		if (q9num1 == q9num2) {
//			System.out.println("서로 다른 정수를 입력하여야 합니다. 다시 입력해 주십시오.");
//			q9num1 = sc.nextInt();
//			q9num2 = sc.nextInt();
//		}
//		else if (q9num1 > q9num2) {
//			System.out.println("num1보다 num2가 크므로 num1과 num2 값을 바꿔주었습니다.");
//			int q9newnum = q9num2;
//			q9num2 = q9num1;
//			q9num1 = q9newnum;
//		}
//		System.out.println("첫 번째 정수 이하이거나, 두 번째 정수가 초과일 경우 참/거짓을 구분하기 위한 새로운 정수 값을 입력해주세요.");
//		int q9num3 = sc.nextInt();
//		boolean q9re = (boolean)(q9num3  <= q9num1 || q9num3 > q9num2);
//		System.out.printf("num1 = %d, num2 = %d 비교 값은 %d 임으로 해당 값은 %s입니다.\n", q9num1, q9num2, q9num3, q9re);
		
		// 10. 사용자로부터 3개의 수를 키보드로 입력 받아
		// 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요
//		System.out.println("정수 3개를 입력해 주십시오.");
//		int q10num1 = sc.nextInt();
//		int q10num2 = sc.nextInt();
//		int q10num3 = sc.nextInt();
//		boolean q10re = q10num1 == q10num2 && q10num1 == q10num3 ? (boolean)(q10num1 == q10num2 && q10num1 == q10num3):
//			q10num1 == q10num2 && q10num1 == q10num3;
//		System.out.println(q10re);
	}

}