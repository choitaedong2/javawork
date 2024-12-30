package chap02_variable;

public class Fommat_07 {

	public static void main(String[] args) {
		String url = "www.google.com";
		// java에서 실수형은 double이 기본자료형
		// 실수형 숫자를 그냥 쓰면 double형으로 인식
		float f1 = 0.10f;
		double d1 = 1.23456789345;
		System.out.printf("%d, %d, %d\n", 10, 5, 1);
		// "\n", "\t" 줄바꿈, tap
		System.out.printf("%f\n", 1.23456789); //float은 소수점 이하 6번째 자리까지 표현 - 반올림
		System.out.printf("%f\n", f1); //double형 출력문은 없기에 변수 출력으로 사용
		System.out.printf("%8f\n", d1); //"%f"는 총 자릿수 선택가능
		// "%n.mf" == 정수 n 자릿수 . 소수 m 자리수 까지 출력
		System.out.printf("%4.2f\n", d1);
		System.out.printf("%12.10f\n", d1);
		System.out.printf("%.2f\n", d1);
		System.out.println("----------------------------\n");
		
		System.out.printf("%s\n", url);
		System.out.printf("%20s\n", url); // 오른쪽 정렬
		System.out.printf("%-20s", url); // 왼쪽 정렬 & 남는 글자수는 오른쪽에 공백 생성
		System.out.println("글씨");
		System.out.printf("%20.8s\n", url); // .n == n글자만 출력
		System.out.println("----------------------------\n");
		
		int octNum = 010; // 십진수 : 8  ~> 앞에 0는 8진수
		int hexNum = 0x10; // 십진수 : 16 ~> 앞에 0x는 16진수
		int binNum = 0b10; // 십진수 : 2 ~> 앞에 0b는 2진수
		
		System.out.printf("8진수=%o, 10진수=%d\n", octNum, octNum);
		System.out.printf("16진수=%x, 10진수=%d\n", hexNum, hexNum);
		System.out.printf("%X\n", 10);
		System.out.printf("%x\n", 10);
		System.out.printf("2진수=%s, 10진수=%d\n", Integer.toBinaryString(binNum), binNum);
		
		int num = 77;
		String a2 = Integer.toBinaryString(num);
		String a8 = Integer.toOctalString(num);
		String a16 = Integer.toHexString(num);
		System.out.println("10진수 77을 2진수로 변환\t"+ a2 +"\n"+ "10진수 77을 8진수로 변환\t"+ a8 +"\n"+ "10진수 77을 16진수로 변환\t"+ a16);
		
		System.out.format("%X\n", 10);
		System.out.format("%x\n", 10);
	}

}
