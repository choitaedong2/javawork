package _03_interface;

public interface Inter {
	// 상수만 사용 가능
	public static final double PI = 3.14; // 정석 방법
	int MAX = 100; // [public static final]이 자동 컴파일 되어 실행
	
	// 추상메서드만 사용 가능 : public abstract void print();
	// 매개변수 필요 없을 시 : public abstract void print();
	public abstract void print(int a);
	public abstract void inMethod();
	String inStr(String name); // 자동으로 [public static]이 컴파일 됨
}
