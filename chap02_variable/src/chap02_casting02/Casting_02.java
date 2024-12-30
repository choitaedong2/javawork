package chap02_casting02;

public class Casting_02 {

	public static void main(String[] args) {
		int num1 = 1234567;
		byte b1 = (byte)num1;
		System.out.println(b1);

		// java에서 정수의 기본 자료형 double
		float float1 = 5.345f;
		//float	= double형은 기본적으로 들어가나 int형 자리에 실수가 들어갔으므로, (float) or +f를 통해 강제 형 변환
		
		// java에서 정수의 기본자료형 int
		long long1 = 1113456711111111111L;
		//long	= 		int + 'L' or 'l'
		
		//	65535
		int num2 = 50896;
		char ch1 = (char)num2;
		System.out.println(ch1);
	}

}
