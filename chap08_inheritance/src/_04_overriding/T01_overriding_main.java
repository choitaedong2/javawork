package _04_overriding;
/*
 * 오버라이딩
 	- 상속관계의 메소드에서만 가능
 	- 선언부가 같아야 된다
 		* 자식 클래스에서 내용만 다르게 프로그램
 */
class Over{
	void show(String str) {
		System.out.println("부모클래스 메소드 : " + str);
	}
	void print(String str) {
		System.out.println("부모클래스 print 메소드 : "+str);
	}
}

class OverChild extends Over{
	// Overriding : 부모 클래스의 프로그램을 덮어씀
	void show(String child) { // 선언부 : 변수명은 상관이 없음, 유형만 같으면 됨
							// void는 스택에 쌓이고 사라지기 때문
		System.out.println("자식클래스 메소드 : "+child);
	}
}

public class T01_overriding_main {

	public static void main(String[] args) {
		OverChild oc = new OverChild();
		// 무조건 나자신에게 메소드가 있나 먼저 확인하고 있으면 수행
		//		나에게 없으면 부모에게 가서 찾아서 있으면 실행
		oc.show("자바 프로그래밍"); // 동일 프로그래밍에 대한 순서 : 자식 클래스(선 확인) ~> 부모 클래스(후)
		oc.print("테스트");
		Over ov = new Over();
		ov.show("오라클");
	}

}
