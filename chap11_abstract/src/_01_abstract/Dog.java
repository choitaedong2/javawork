package _01_abstract;

public class Dog extends Pet{
	Dog() {
		this("똥개", "누렁색", "똥을 잘먹음");
	}
	
	Dog(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	/*
	void Sound() {
		// 구현할 내용이 없더라도 구조(빈껍데기)를 갖춰야 함
		
	}
	*/	
	@Override
	void Sound() {
		System.out.println("멍 멍");
	}
}