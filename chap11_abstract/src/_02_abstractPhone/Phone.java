package _02_abstractPhone;

public abstract class Phone {
	String model;
	String color;
	boolean bell;
	boolean hangUp;
	String message;
	boolean hangQut;
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	void bell() {
		if(bell = !bell)
			System.out.println("띠리리?");
		else
			System.out.println("벨소리가 멈춥니다.");
	}
 	
 	void sendVoice(String message) {
 		System.out.printf("'%s'를 전송합니다\n",message);
 	}
 	void receveVoice(String message) {
 		System.out.printf("'%s'를 수신합니다\n",message);
 	}
 	abstract void hangUp();
 	abstract void hangOut();
}
