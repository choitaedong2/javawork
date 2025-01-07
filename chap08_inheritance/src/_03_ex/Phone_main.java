package _03_ex;
/*
Phone
	속성 : 	model
			color
	생성자(model, color)
	void bell()
	void hangUp()
	void sendVoice(message)
	void receveVoice(message)
	void hangOut()
	
SmartPhone extends Phone
	오류는 알아서 해결
	String search(search)
*/
public class Phone_main {

	public static void main(String[] args) {
		SmartPhone smp = new SmartPhone("스마트폰", "검정색");
		smp.bell();
		smp.hangUp();
		smp.bell();
		smp.sendVoice("아무말");
		smp.receveVoice("dkanakf");
		smp.hangOut();
		smp.search("dkanakf");
	}

}
