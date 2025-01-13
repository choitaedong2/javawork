package _01_exception;

public class T02_exception {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try { // 예외가 발생할 수 있는 프로그램
			System.out.println(3);
			System.out.println(4/0);
			System.out.println(5);
		} catch(Exception e) { // 예외가 발생 했을 때 처리 구문
			System.out.println("예외 처리함");
		}
		
		System.out.println(6); // try~catch문과 상관없음
	}

}
