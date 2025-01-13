package _02_userException;

public class Ex01 {
	
	public void sum(double num1, double num2) throws UserException {
		if(num1 < 0 || num2<0) {
			throw new UserException("양수를 입력해 주십시오.");
		}
		else
			System.out.println(num1+num2);
	}
}
