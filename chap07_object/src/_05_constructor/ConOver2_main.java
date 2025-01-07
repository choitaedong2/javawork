package _05_constructor;

class ConOver2 {
	int num;
	double dou;
	String name;
	String str;
	
	// 다른 생성자 호출	
	ConOver2() {
		// System.out.println(); : 다른 호출자가 상단에 와야함으로 오류 발생
		this(1, 1.0, "홍길동"); // 무조건 첫째줄에 넣어야 함
		System.out.println("매개변수가 없는 생성자");
	}
	ConOver2(int num) {
		this(num, 1.0, "홍길동");
		System.out.println("매개변수가 1개인 생성자");
	}
	ConOver2(int num, double dou) {
		this(num, dou, "홍길동");
		System.out.println("매개변수가 2개인 생성자");
	}
	ConOver2(int num, double dou, String name) {
		System.out.println("매개변수가 3개인 생성자");
		this.num = num;
		this.dou = dou;
		this.name = name;
	}
	
	// 가변인자 : 들어올 인자(매개변수에 넣어줄 값)의 갯수를 모를 때
	// (int... num) : 인자가 0개 이상
	// *반드시 와야할 인자는 앞으로 와야한다.
	
	void method(int... num) {
		System.out.println("인자가 0개 이상");
		for(int result : num) {
			System.out.println(result);
		}
		System.out.println("--------------------------");
	}
	void method2(int num, int... num2) {
		System.out.println("인자가 1개 이상");
		System.out.println("첫 번째 값 : " + num);
		for(int result : num2) {
			System.out.println(result);
		}
		System.out.println("--------------------------");
	}
// 						/	, 홍길동, 이순신, 강감찬
	public void method3(String str, String... name) {
		for(String n1 : name) {
			System.out.println(n1 + str);
		}
	}
//						홍길동 / 이순신 / 강감찬
}

public class ConOver2_main {

	public static void main(String[] args) {
		ConOver2 con = new ConOver2(5);
//		System.out.println(con.num);
//		System.out.println(con.dou);
//		System.out.println(con.name);
//		System.out.println("=========================");
//		con.method();
//		con.method(5);
//		con.method(5,6,7,8);
//		System.out.println("=========================");
//		con.method2(6);
//		con.method2(6, 1, 4, 5);
		String[] names = {"홍길동", "이순신", "강감찬"};
		con.method3("/", names);
		
		}
	}


