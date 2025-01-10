package _01_abstract;
/*
 * 추상클래스를 상속받은 클래스는 반드시 추상메서드를 구현해야 한다.
 * 추상메서드에 구현할 내용이 없다면 빈 껍데기라도 써야됨
 */
public class Cat extends Pet {
	Cat() {
		this("페르시안", "흰색", "댕냥이");
	}
	
	Cat(String kind, String color, String feature) {
		super(kind, color, feature);
	}

	@Override
	/*
	void Sound() {
		// 구현할 내용이 없더라도 구조(빈껍데기)를 갖춰야 함
		
	}
	*/	
	void Sound() {
		System.out.println("냐옹 냐옹");
	}
}