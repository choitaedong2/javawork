package _02_car;

public class Car {
	public String model;
	String company;
	boolean power;
	int speed;
	
	// 생성자
	Car(String model, String company){
		this.model = model;
		this.company = company;
	}
	
	// 메소드
	void power() {
		if(power = !power)
			System.out.println("시동을 켭니다.");
		else
			System.out.println("시동을 끕니다.");
	}
	// 메소드
	int speedUp() {
		speed +=5;	
		return speed;
	}
	// 메소드
	int speedDown() {
		speed -=5;	
		return speed;
	}
}