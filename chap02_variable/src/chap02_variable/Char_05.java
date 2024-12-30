package chap02_variable;

public class Char_05 {

	public static void main(String[] args) {
		// 리터럴 : 저장공간을 만들면서 바로 값을 넣는 것
		char ch = '0';
		System.out.println(ch);
		System.out.println((int)ch);
		
		char ch2 = 'a' + 1; // 유니코드a(97) ~> 97 + 1 = 98 = b
		System.out.println(ch2);

		/* 리터럴 값이 아닌 나중에 더하면 오류가 남
		char ch3 = 'A';
		char result = ch3 + 1;
		*/
		// 형 변환시 int 이하는 연산을 하면 모두 int형으로 형 변환이 됨
		char ch3 = 'A';
		int result = ch3 + 1;
		System.out.println(result);
	}

}
