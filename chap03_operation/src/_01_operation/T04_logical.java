package _01_operation;

public class T04_logical {

	public static void main(String[] args) {
		// 논리곱(and)과 논리합(or)
		/*
		 x	y 논리곱(&&) 논리합(||)
		 
		 
		 
		 1	1	1		1			
		 */
		
		int num1 = 10;
		int num2 = 20;
		boolean result = num1==num2 && num2>num1;
		
		System.out.println(result);
		
		result = num1==num2 || num2>num1;
		System.out.println(result);
		System.out.println("---------------");
		
		// ! : not
		boolean b1 = num1 >= num2;
		System.out.println(b1);
		System.out.println(!b1);
		System.out.println(!!b1);
		
		// A : 65 ~ 90, a : 97
		char ch1 = 'K';
		System.out.println(ch1);
		System.out.println("대문자인가? " + (ch1>=65 && ch1<=90));
		System.out.println("대문자인가? " + (ch1>='A' && ch1<='Z'));
		System.out.println("대문자인가? " + (ch1>='a' || ch1<='z'));
		char ch2 = 'l';
		System.out.println("소문자인가? " + (ch2>='a' && ch1<='z'));
		
	}

}
