package chap02_casting02;

public class Promotion_01 {

	public static void main(String[] args) {
		// 자동 형 변환 : 작은 자료형을 큰 자료형에 넣을 때
		byte b1 = 20;
		short s1 = b1;
		int int1 = b1;
		int1 = s1;
		
		char ch1 = '최';
		int int2 = ch1;
		System.out.println("최의 유니코드 : " + int2);
		
		double d1 = int1;
		System.out.println(d1);
		
		d1 = s1 + 1;
		System.out.println(d1);
	}

}
