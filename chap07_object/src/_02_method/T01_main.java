package _02_method;

public class T01_main {

	public static void main(String[] args) {
		T01_api_method m1 = new T01_api_method();
		// System.out.println(m1.print1()); 반환값이 없기 때문에 오류 발생
		m1.print1();

		System.out.println();
		
		System.out.println(m1.print2());
		int result = m1.print2();
		System.out.println(result);
		
		System.out.println(m1.print3());
		
		System.out.println(m1.print4());
		
		m1.print5(10);
		
		int sum = m1.print6(10, 2);
		System.out.println(m1.print6(10, 5));
		System.out.println(sum);
		
		m1.print7("더조은", 100);
		
		T01_api_op op = new T01_api_op();
		int add = op.add(2, 9);
		int minus = op.minus(4, 6);
		double div = op.divide(3, 2);
		int multi = op.multiply(2,  4);
		int remain = op.remainder(18, 5);
		System.out.println(add);
		System.out.println(op.add(2, 9));
		System.out.println(minus);
		System.out.println(div);
		System.out.println(multi);
		System.out.println(remain);
	}

}
