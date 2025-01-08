package _03_ex;

public class SmartPhone extends Phone {
	SmartPhone(String model, String color) {
		super(model, color);
	} // SmartPhone sp = new SmartPhone(); main에서 객체 생성
	/*
	 SmartPhone() {
	 	super("삼성", "흰색")
	 }
	 */
	String search;
	
	void search(String search) {
		System.out.printf("'%s'내용을 검색합니다\n", search);
	}
	
}
