package _01_operation;

import java.util.Scanner;

public class Q2_ans {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Q1
		System.out.println("신상정보르 이름, 성별(남자 or 여자), 나이, 키를 순서대로 띄어쓰기로 입력해주세요. ");
		String name = sc.next();
		String sex = sc.next();
		int age = sc.nextInt();
		float height = sc.nextFloat();
		
		System.out.println("키 " + height + "cm인 " + age + "살 " + sex + " " +name + "반갑습니다^^");
		
		// Q2
		System.out.println("2개의 정수를 입력해 주십시오.");
		int q2num1 = sc.nextInt();
		int q2num2 = sc.nextInt();
		System.out.println("2개의 정수 합은 = " + (q2num1+q2num2) + " 입니다.");
		System.out.println("2개의 정수 차는 = " + (q2num1-q2num2) + " 입니다." );
		System.out.println("2개의 정수 곱은 = " + (q2num1*q2num2) + " 입니다." );
		System.out.println("2개의 정수 나누기 몫은 = " + (q2num1/q2num2) +" 입니다." );
		
		// Q3
		System.out.println("연산에 필요한 사각형의 가로 새로 실수 값을 입력해 주세요.");
		float q3num1 = sc.nextFloat();
		float q3num2 = sc.nextFloat();
		System.out.println("입력 받은 가로, 새로 값에 대한 사각형 둘레는 : " + ((q3num1+q3num2)*2) + "입니다.");
		System.out.println("입력 받은 가로, 새로 값에 대한 사각형 면적은 : " + (q3num1*q3num2) + "입니다.");
		
		// Q4
		System.out.println("3철자 이상으로 이루어진 영단어를 입력해 주세요.");
		String q4word = sc.next();
		System.out.println("입력 받은 단어는 : " + q4word);
		System.out.println("해당 단어의 첫 번째 문자는 : " + q4word.charAt(0));
		System.out.println("해당 단어의 두 번째 문자는 : " + q4word.charAt(1));
		System.out.println("해당 단어의 셋 번째 문자는 : " + q4word.charAt(2));
	}

}