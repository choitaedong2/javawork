package _06_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[p203 ~ 206 연습문제 풀이]");
		System.out.println("01. 다음 중 클래스의 구성 멤버가 아닌 것은? : 3) 로컬변수");
		System.out.println("=================================");
		System.out.println("02. 객체에 대한 설명으로 올바르지 않은 것은? : 4) 하나의 클래스는 하나의 객체만 생성 가능하다.");
		System.out.println("=================================");
		System.out.println("03. Person 클래스 작성");
		System.out.println("설명을 확인하고자 하는 필드명을 입력하시오");
		System.out.println("설명문: [all, name, gender, age, height, weight] 0: end");
		Person p = new Person();
//		p.describe(sc.next());
		System.out.println("=================================");
		System.out.println("04. 생성자에 대한 올바르지 않은 것 : 4) 생성자를 정의하지 않으면 컴파일러가 자동으로 기본 생성자를 추가한다.");
		System.out.println("=================================");
		System.out.println("05. 메서드에 대한 설명으로 올바르지 않은 것 : 1) 클래스 내에 특정 기능을 수행하는 역할을 한다.");
		System.out.println("=================================");
		System.out.println("06. 메서드 오버로딩이란 : 부모 변수에 값을 대입");
		System.out.println("=================================");
		System.out.println("07. 가장 나중에 실행이 종료되는 매서드 : getAverage()");
		System.out.println("=================================");
		System.out.println("08. A : '출력값 : 123456'");
		System.out.println("=================================");
		System.out.println("09. ");
		System.out.println("public static Excercise str = new Excercise();");
		System.out.println("public static Excercise getInstance() {return str;}");
		System.out.println("=================================");
		System.out.println("10. 자신의 주소를 참조하는 예약어 : this");
		System.out.println("=================================");
		System.out.println("11. ");
		System.out.println("최대값 : " + new Math().max(1, 3, 5, 9 ,4));
		System.out.println("최소값 : " + new Math().min(1, 3, -7, 9 ,4));
		System.out.println("=================================");
		System.out.println("12. 4)");
		System.out.println("=================================");
	}

}
