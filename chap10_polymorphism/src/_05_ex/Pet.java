package _05_ex;

public class Pet {
	private String kind;
	private String color;
	private String feature;
	
	Pet(String kind, String color, String feature){
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	void Sound() {
		// 출력문
		System.out.println("울음 소리");
	}
	
	void info() {
		// 출력문
		System.out.println("종류 : "+ kind + ", 색상 : "+color);
	}
	// getter 메소드
	// 반환형을 써줌
	String getKind() {
		return kind;
	}
	String getColor() {
		return color;
	}
	String getFeature() {
		return feature;
	}
	@Override
	public String toString() {
		return "종류 : "+ kind + ", 색상 : "+color + ", 특징 : " + feature;
	}
}
