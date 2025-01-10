package _02_abstractPhone;

public class SmartPhone extends Phone {
	SmartPhone(){
		super("스마트폰", "흰색");
	}
	
	SmartPhone(String model, String color) {
		super(model, color);
	}
	// SmartPhone sp = new SmartPhone(); main에서 객체 생성
	/*
	 SmartPhone() {
	 	super("삼성", "흰색")
	 }
	 */
	String search;
	
	void search(String search) {
		System.out.printf("'%s'내용을 검색합니다\n", search);
	}

	@Override
	void hangUp() {
		System.out.println("손가락을 오른쪽으로 민다");
	}

	@Override
	void hangOut() {
		 System.out.println("손가락을 왼쪽으로 민다");	
	}
	
}
