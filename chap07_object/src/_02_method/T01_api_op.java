package _02_method;

public class T01_api_op {
	// 5칙 연산
	
	// 메소드 4개
	// +,-,*,% = return int형
	// 	  /    = return double형
	
	//매개변수 int형으로 2개 받기
	
	int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	int minus(int num1, int num2) {
		int minus = num1 - num2;
		return minus;
	}
	int multiply(int num1, int num2) {
		int multiply = num1 * num2;
		return multiply;
	}
	int remainder(int num1, int num2) {
		int remainder = num1 % num2;
		return remainder;
	}
	double divide(int num1, int num2) {
		double divide = (double)num1 / num2;
		return divide;
	}
}
