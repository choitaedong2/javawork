package _02_ex;

import java.util.Scanner;

public class T01_Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("국어, 영어, 수학 점수를 입력하시오.");
//		int kor = sc.nextInt();
//		int eng = sc.nextInt();
//		int math = sc.nextInt();
//		
//		if (kor >= 40 && eng >=40 && math >= 40 && ((kor+eng+math)/3)>=60)
//			System.out.println("합격");
//		else
//			System.out.println("불합격");
//
//		System.out.println("---------------------------------");
//		
//		// String 변수 들은 주소값 기반으로 반환하기에 '=='을 사용할 수 없다.
//		// id, pass를 int로 생성하여 문제 풀이
//		int user_id = 1234;
//		int user_pass = 1234;
//				
//		System.out.println("ID와 비밀번호를 입력하세요");
//		int id = sc.nextInt();
//		int pass = sc.nextInt();
//		
//		if(user_id == id && user_pass == pass)
//			System.out.println("로그인 성공");
//		else if(user_id == id && user_pass != pass)
//			System.out.println("비밀번호가 틀렸습니다.");
//		else if(user_id != id && user_pass == pass)
//			System.out.println("아이디가 틀렸습니다.");
//		else
//			System.out.println("로그인에 실패 했습니다.");
//			
//		System.out.println("---------------------------------");
//		
//		System.out.println("키와 몸무게를 입력하시오.");
//		double height = sc.nextDouble();
//		double weight = sc.nextDouble();
//		double bmi = weight/((height/100)*(height/100));
//		
//		if (bmi < 0)
//			System.out.println("잘못된 입력값 입니다.");
//		else if (bmi >= 30)
//			System.out.println("고도 비만");
//		else if (bmi >=25)
//			System.out.println("비만");
//		else if (bmi >=23)
//			System.out.println("과체중");
//		else if (bmi >=18.5)
//			System.out.println("정상체중");
//		else
//			System.out.println("저체중");
//		System.out.println("---------------------------------");
		
		System.out.println("4. 중간고사, 기말고사, 과제점수, 출석 회수를 순서대로 입력 하시오.");
		double m_score = sc.nextDouble()*2/10;
		double f_score = sc.nextDouble()*3/10;
		double r_score = sc.nextDouble()*3/10;
		int a_score = sc.nextInt();
		double total = m_score+f_score+r_score+a_score;
		
		System.out.println("중간고사 점수(20) : "+ m_score);
		System.out.println("기말고사 점수(30) : "+ f_score);
		System.out.println("과제 점수(30) : "+ r_score);
		System.out.println("출석 점수(20) : "+ a_score);
		System.out.println("총점 : "+ total);
		
		if (a_score <= 14)
			System.out.printf("Fail [출석 횟수 부족(%d/20)]", a_score);
		else if (total >= 70)
			System.out.println("Pass");
		else
			System.out.println("Fail [점수 미달]");
		
		System.out.println("---------------------------------");
	}

}