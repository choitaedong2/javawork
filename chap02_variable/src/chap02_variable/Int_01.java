package chap02_variable;

public class Int_01 {

	public static void main(String[] args) {
		// print & println 줄바꿈 차이
		
		// 변수 : 저장공간

			/*
				int : 정수를 저장하는 공간 (4byte)
				double : 
				char : 
			*/
		
		// 저장 공안 만들기
		int number;
		number = 3;
		System.out.println(number);
		
		// 기존 저장공간에 덮어쓰기
		number = 4;
		System.out.println(number);
		
		// 새로운 저장 공안 만들기
		int number2 = 5;
		System.out.println(number);
		System.out.println(number2);
		
		// 새로운 저장공간에 덮어쓰기
		number2 = 8;
		
		int sum = number + number2;
		System.out.println(number+"+"+number2+"="+(number+number2));
		System.out.println(number+"+"+number2+"="+sum);
		
		// 새로운 저장공간 만들기 기존에 있던 저장공간
	}

}
