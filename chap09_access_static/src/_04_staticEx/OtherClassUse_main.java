package _04_staticEx;
// 다른 package의 클래스를 사용하려면 import한 후 사용가능
// import 패키지이름.클래스이름 (클래스이름은 패키지이름.클래스이름이 원래 클래스를 이룸)
// import _03_bank.*;
import _03_bank.Bank;
import _02_car.*;

// *패키지 이용시 하위 생성자, 변수, 메소드도 public을 붙인것만 사용 가능
public class OtherClassUse_main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.depositCount(5000); // bank의 하위 메소드도 public 전환 필요
		System.out.println(bank.getCount());
		
		Ambulance ab = new Ambulance("amCar", "기아");
		System.out.println(ab.model);
		ab.siren();
	}

}
