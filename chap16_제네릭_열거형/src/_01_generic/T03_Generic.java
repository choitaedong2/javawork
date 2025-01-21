package _01_generic;

import java.util.ArrayList;

class Fruit {public String toString() {return "Fruit";} }
class Apple3 extends Fruit {public String toString() {return "Apple3"; }}
class Grape extends Fruit {public String toString() {return "Grape"; }}
class Tjoeun {public String toString() {return "Tjoeun";} }

class Box3<T> {
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {list.add(item);}
	T get(int index) {return list.get(index);}
	int size() {return list.size();}
	public String toSting() {return list.toString();}
	}
public class T03_Generic {

	public static void main(String[] args) {
		Box3<Fruit> fruitBox = new Box3<>();
		Box3<Apple3> appleBox = new Box3<>();
		Box3<Tjoeun> tjoeunBox = new Box3<>();

		fruitBox.add(new Fruit());	// 자신의 타입 넣음
		fruitBox.add(new Apple3());	// 자식의 타입을 부모타입으로 자동변환이 되어 넣음
		fruitBox.add(new Grape());
		// fruitBox.add(new Tjoeun()); // 오류 : 타입이 맞지 않음
		
		appleBox.add(new Apple3()); // Apple만 넣을 수 있다
		appleBox.add(new Apple3()); // Apple만 넣을 수 있다
		// appleBox.add(new Fruit()); : 오류 : 타입이 맞지 않음
		
		tjoeunBox.add(new Tjoeun());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(tjoeunBox);
	}

}
