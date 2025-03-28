package _01_generic;

class Box2<T> { //원하는 클래스명<원하는 변수명> {}
	private T t;
	public T get() {
		return t;}
	public void set(T t) {
		this.t = t;}
}

class Apple2 {
	int num = 10;
}
class Banana2 {
	boolean bool = true;
}

public class T02_Generic {

	public static void main(String[] args) {
		Box2<String> box = new Box2<>();
		box.set("홍길동");
		String str = box.get();
		System.out.println(str); // String 클래스는 toString을 overriding 해놓음
		
		Box2<Apple2> apple = new Box2<>();
		apple.set(new Apple2());
		Apple2 app = apple.get();
		System.out.println(app.num);
		
		Box2<Banana2> bana = new Box2<>();
		bana.set(new Banana2());
		Banana2 banana = bana.get();
		System.out.println(banana.bool);
	}

}
