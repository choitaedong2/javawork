package _05_ex;

public class Pet_main {

	public static void main(String[] args) {
		// Pet pet = new Frog(); 가능
		Pet pet = new Frog("황소개구리", "갈색", "엄청 먹음");
		pet.info();
		System.out.println(pet);
		System.out.print("울음 소리 : ");
		pet.Sound();
		System.out.println("종류 : " + pet.getKind());
		System.out.println("색상 : " + pet.getColor());
		System.out.println("특징 : " + pet.getFeature());
		System.out.println("====================================");
		
		pet = new Cat();
		pet.info();
		System.out.println(pet);
		System.out.print("울음 소리 : ");
		pet.Sound();
		System.out.println("종류 : " + pet.getKind());
		System.out.println("색상 : " + pet.getColor());
		System.out.println("특징 : " + pet.getFeature());
		System.out.println("====================================");
		
		
		
		pet = new Dog();
		pet.info();
		System.out.println(pet);
		System.out.print("울음 소리 : ");
		pet.Sound();
		System.out.println("종류 : " + pet.getKind());
		System.out.println("색상 : " + pet.getColor());
		System.out.println("특징 : " + pet.getFeature());
		System.out.println("====================================");
	}

}
