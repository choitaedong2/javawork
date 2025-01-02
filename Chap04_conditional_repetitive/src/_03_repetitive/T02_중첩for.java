package _03_repetitive;

public class T02_중첩for {

	public static void main(String[] args) {
		/*
		 * 중첩 for문
		   for(초기식; 조건식; 증감식) {
		   		for(초기식; 조건식; 증감식) {
		   			실행구문;
		   		}
		   }
		 */
		for(int i=1; i<=3; i++) {
			for(int j =5; j<=7; j++) {
				System.out.println("i="+i + ", j="+j);
			}
		}
		// 구구단
		for(int i=2; i<=9; i++) {
			System.out.println(i + "단 시작");
			for(int j=1; j<=9; j++)
				System.out.printf("%d*%d : %d,", i,j,(i*j));
			System.out.println("\n" + i + "단 종료");
		}
	}

}
