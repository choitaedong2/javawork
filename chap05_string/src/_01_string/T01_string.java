package _01_string;

import java.util.Scanner;

public class T01_string {

	public static void main(String[] args) {
		// "홍길동"의 주소가 100번지라 한다면 name1~name3는 모두 100번지 주소를 가짐
		// 객체가 1개 임
		String name1 = "홍길동";
		String name2 = "홍길동";
		System.out.println(name1==name2);
		
		String name3 = name1;
		System.out.println(name1==name3);


		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		// 변수가 같은지 묻는 질문은 주소를 묻는 것
		System.out.println("주소가 같은가? " + (str1==str2));
		// 안의 값이 같은지 확인하기 위해서는 .equals를 사용
		System.out.println("변수 안의 값이 같은가 ?" + str1.equals(str2));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주소 입력(시 또는 도만) : ");
		String city = sc.next();
		
//		if(city =="경기도")
//			System.out.println("경기도 사람");
		if(city.equals("경기도"))
			System.out.println("경기도 사람");
		System.out.println("종료");
	}
}