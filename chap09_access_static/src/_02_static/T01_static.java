package _02_static;
/*
 * 변수의 종류
 	1. 지역 변수 : 중괄호 안에서만 사용 가능. 중괄호를 빠져나오면 저장공간은 사라짐(for문안, 메소드안)
 	2. 인스턴스변수 : 클래스 바로 안에 선언(객체가 만들어질 때 저장공간이 마련됨)
 	3. 정적변수(글로벌변수, static변수) : 모든 객체가 공통으로 사용하는 값
 		: 클래스가 올라오는 저장공간(메서드공간)에 변수의 저장공간이 마련됨
 	
 */
public class T01_static {
	// 인스턴스 변수(=속성=필드)
	int num = 5;
	String name = "인스턴스";
	
	// 정적 필드
	static int numSt =10;
	static String nameSt = "박정적";
	
	// 인스턴스 메서드
	// 현 메서드를 호출한다는 것은 객체를 생성했다는 의미
	void println() {
		System.out.println("인스턴스 메서드");
		System.out.println(name);
		System.out.println(nameSt);
		// 정적 필드 사용가능, 객체를 생성해도 사용할 수 있고, 객체가 생성되어 있지 않아도 사용 가능
	}
	// 정적 메서드
	// 정적 메서드 호출 시 객체를 생성하지 않고도 호출가능
	static void printSt() {
		System.out.println("정적 메서드");
		System.out.println(nameSt); // 정적 필드 사용가능
		// 인스턴스 필드는 반드시 객체가 생성되어야지만 저장공간 확보
		// System.out.println(num); num은 객체(저장 공간이)가 생성되어 있어야만 함
		// 반드시 객체가 생성되었다는 전제가 없어서 사용 못함
	}
}
