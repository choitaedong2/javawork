package _06_ex;

import java.util.Scanner;

public class Person {
	Scanner sc = new Scanner(System.in);
	String name;
	String gender;
	String obj;
	int age;
	int height;
	int weight;
	
	public void describe(String obj) {
		boolean a = true;
		do {
			if(obj.equals("end")){
				a=false;
				System.out.println("종료하였습니다");
			}
			else {
			switch(obj) {
			case "all":
				System.out.println("name = 이름,");
				break;
			case "name":
				System.out.println("name = 이름");
				break;
			case "gender":
				System.out.println("gender = 성별");
				break;
			case "age":
				System.out.println("age = 나이");
				break;
			case "height":
				System.out.println("height = 키");
				break;
			case "weight":
				System.out.println("weight = 몸무게");
				break;
			} obj = sc.next(); }
		} while(a);
	}
}
