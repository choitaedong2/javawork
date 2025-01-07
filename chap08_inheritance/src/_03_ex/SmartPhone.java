package _03_ex;

public class SmartPhone extends Phone {
	SmartPhone(String model, String color) {
		super(model, color);
	}
	String search;
	
	void search(String search) {
		System.out.printf("'%s'내용을 검색합니다\n", search);
	}
	
}
