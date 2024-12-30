package chap02_variable;

import java.util.Scanner;

public class Report_08 {

	public static void main(String[] args) {
		// 사용자로 부터 국어, 수학, 컴퓨터의 점수를 입력받아
		// 총점과 평균(소수점 2째자리까지(반올림)) 출력
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("(국어, 수학, 컴퓨터) 점수를 입력하시오.(띄어스기로)");
//		float kor = sc.nextFloat(); float math = sc.nextFloat(); float com = sc.nextFloat(); 
		System.out.println("국어 점수를 입력하시오.");
		float kor = sc.nextFloat();
		System.out.println("수학 점수를 입력하시오.");
		float math = sc.nextFloat();
		System.out.println("컴퓨터 점수를 입력하시오.");
		float com = sc.nextFloat();
		
		System.out.printf("귀하의 총점은 : %.0f입니다.\n", (kor+math+com));
		System.out.printf("귀하의 평균은 : %.1f입니다.\n", (kor+math+com)/3);

	}

}
