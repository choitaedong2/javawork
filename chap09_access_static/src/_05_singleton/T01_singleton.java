package _05_singleton;
/*
 * 싱슬톤 : 객체를 오로지 한개만 만들수 있도록 보장하는 기법 (단일 객체를 재사용하기 위함)
   사용하는 이유 : 최초 호출시 만들어 두었던 객체를 재사용하는 패턴(계속 생성하고 삭제를 하지 않아도 된다)
 	  - 장정	: 메모리 낭비 방지
 	  - 단점	: 의존성이 높아진다
 			: private 생성자 때문에 상속이 어렵다
 			: 테스트하기 힘들다
 */
public class T01_singleton {
	// 인스턴스 변수
	// 같은 클래스 내부이기 때문에 private 변수를 생성하지만 main에서는 생성 불가
	public static T01_singleton singleton = new T01_singleton();
	
	// 다른 클래스에서 객체 생성 못하도록 막아 놓음
	private T01_singleton() {
		System.out.println("객체 생성");
	}
	
	// 정적 메소드(정적 변수만 사용가능)
	public static T01_singleton getSingleton() {
		return singleton;
	}
}
