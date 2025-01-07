package _02_car;

public class Car_main {

	public static void main(String[] args) {
		Ambulance am1 = new Ambulance("am1Car", "KIA");
		
		am1.power();
		System.out.println("현재 속도 : "+am1.speedUp());
		System.out.println("현재 속도 : "+am1.speedDown());
		am1.siren();
		am1.firstAid();
		am1.siren();
		am1.power();
	}

}
