package _01_langPackage;

class Dog2{
	String kind;
	int age;
	Dog2(){
		this("말티즈", 3);
	}
	Dog2(String kind, int age){
		this.kind = kind;
		this.age = age;
	}
	
	@Override // 주소 대신 toString을 통해 overriding
	public String toString() {
		return kind + ", " + age;
	}
}

public class T05_getClass {

	public static void main(String[] args) {
		Dog2 dog1 = new Dog2();
		System.out.println(dog1);
		
		System.out.println(dog1.getClass());

	}

}
