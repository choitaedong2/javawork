package _05_super;
class Parent2 {
	int x = 10; // 인스턴스 변수
}
class Child2 extends Parent2 {
	int x = 200; // 인스턴스 변수
	void show() {
		System.out.println("x= "+x); // 지역변수 삽입
		System.out.println("this.x="+this.x); //인스턴스 변수
		System.out.println("super.x="+super.x); //부모의 인스턴스 변수
	}
}
public class T02_super_main {

	public static void main(String[] args) {
		Child2 child = new Child2();
		child.show();
	}

}
