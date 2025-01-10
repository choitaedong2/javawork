package _05_ex;

public class Cat extends Pet {
	Cat() {
		this("페르시안", "흰색", "댕냥이");
	}
	
	Cat(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	
	@Override
	void Sound() {
		System.out.println("냐옹 냐옹");
	}
}