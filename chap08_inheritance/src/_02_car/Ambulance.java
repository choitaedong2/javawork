package _02_car;

// 상속 받은 클래스의 생성자 주석 처리 필요 (메모리 관련) or 생성자 : Ambulance() {super();} 입력 필요
public class Ambulance extends Car { 
	
	// 부모 클래스 생성자에 대한 부모에게 넘겨줄 super값 필수
	public Ambulance(String model, String company) {
		super(model, company); // super : 부모의 생성자 호출
	}
//	Ambulance() {
//		super("myAm", "삼성");
//	}
	
	
	public boolean siren; // 기본값 : false
	
	// 메소드
	public void siren() {
		if(siren = !siren)
			System.out.println("삐요삐요~~~~");
		else
			System.out.println("사이렌을 멈춥니다.");
	}
	
	void firstAid() {
		System.out.println("응급처치를 합니다.");
	}
}
