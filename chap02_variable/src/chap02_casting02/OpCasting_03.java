package chap02_casting02;

import java.util.Scanner;

public class OpCasting_03 {

	public static void main(String[] args) {
		// int 보다 작은 자료형은 연산시 int형
		byte b1 = 10;
		short s1 = 5;
		
		// byte result = b1 + s1은 강제 형 변환이 필요
		byte result = (byte) (b1 + s1);

		// 리터럴일때는 연산이 아니라 다음 글자를 의미
		char c1 = 'A'+1;
		System.out.println(c1);
		// char ch = c1+1; ~> 연산식임으로 오류 발생
		int ch = c1+1;
		char ch2 = (char)(c1+1);
		System.out.println(ch);
		System.out.println(ch2);
		
		int num1 = 100;
		int num2 = 3;
		int result3 = num1 / num2;
		System.out.println(result3);
		
		double result4 = num1/num2; // 실수 변수에 정수/정수인 정수 값을 대입하여 몫만 출력
		System.out.println(result4);
		System.out.println("--------------");
		/*
		1. 문자하나를 입력받아 그 문자의 유니코드를 출력하기

		Scanner sc = new Scanner(System.in);
		System.out.println("한 문자를 입력하시오.");
		char q1Var = sc.next().charAt(0);
		System.out.println((int)q1Var);

		3.
		  	int iNum1 = 10;
		    int iNum2 = 4;
		    float fNum = 3.0f;
		    double dNum = 2.5;
		    char q3ch = 'K'; 

		   3.1  iNum1 / iNum2의 몫 출력
		System.out.println(iNum1/iNum2);
		   3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기
		int q3Ans = iNum1*iNum2;
		System.out.println(q3Ans);
		   3.3  iNum1의 값이 10.0으로 출력되게 하기
		System.out.println((double)iNum1);
		   3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
		System.out.println((double)iNum1/iNum2);
		   3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오
		System.out.println(iNum1/(int)fNum);
		   3.6  iNum1 / fNum 한 결과 소수점 13자리이상까지 나오게 하시오
		System.out.printf("%.13f", (iNum1/fNum));   
		   3.7  q3ch변수의 유니코드 출력하기
		System.out.println((int)q3ch);
		   3.8  q3ch변수에 1을 더해 L 이 출력되게 하시오
		System.out.println((char)(q3ch+1));
		*/
		
	}

}
