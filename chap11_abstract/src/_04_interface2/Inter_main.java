package _04_interface2;

public class Inter_main {

	public static void main(String[] args) {
		InterClass ic = new InterClass();
		ic.print(5);
		ic.inMethod();
		System.out.println(ic.PI);
		
		// ic.PI = 1.4356; 상수이기 때문에 값 변환 불가
		// Inter in = new Inter(); 인터페이스는 객체를 생성할 수 없다.
		
		System.out.println(ic.add(5,  9));
	}
}
