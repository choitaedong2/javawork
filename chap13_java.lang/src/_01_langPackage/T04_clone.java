package _01_langPackage;

/*
 * 
 * clone() : 객체 복제
  	1.	implements Cloneable : clone하고자하는 클래스에 반드시 넣어줘야 한다.
  		: '이 클래스는 복제할 수 있는 클래스'이다라는 것을 알려줄 목적
  	2.	clone()을 오버라이딩하지 않아도 된다.
  		그러나 object클래스의 clone()메소드는 접근제어자가 protected라서 같은 java.lang패키지에 있어야 한다.
  	3.	2번과 같은 이유로 clone()을 오버라이딩 해야함
 */
// clone을 하려면 반드시 implements해야함
// 구현해야할 요소가 없기 때문에 코드 가독성을 위한 용도
class A {
	int num =3;
	
	int getNum() {
		return num;
	}
	void setNum(int num) {
		this.num = num;
	}
}

class Point implements Cloneable {
	int x;
	int y;
	A a = new A(); // 참조형 변수
	
	Point() {}
	Point(int x, int y){
		this.x = x;
		this.y =y;
	}
	
	int aa(int num) {
		a.num = num;
		return a.num;
	}
	/*
	 * // return의 자료형이 Object 클래스 사용할 때는 형변환을 계속 해줘야 한다.
	 * @Override
	 * public Object clone() { Object obj = null; try { obj =
	 * super.clone(); } catch (CloneNotSupportedException e) { e.printStackTrace();
	 * // or getMessage
	 *  } return obj; }
	 */
	// 처음부터 
	@Override
	public Point clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
				e.printStackTrace(); // or getMessage
		}
		// 참조형 변수도 새롭게 만들어서 객체의 주소가 다른 주소가 들어가야 된다.
		A b = a;
		a = new A();
		a.num = b.num; 
//		new A().num = a.num; // 한줄로 작성 가능
//		a = new A().setNum(a.num); // getter, setter 메서드
		
		return (Point) obj;
	}
	
	@Override
	public String toString() { // 통상적으로 toString은 하단에 배치
		return "x="+x + ", y="+y + ", a=" + a.num;
	}
}
public class T04_clone {

	public static void main(String[] args) {
		Point original = new Point(3,4);
		Point copy = original.clone();
		copy.a.setNum(100);
//		copy.a = 100; 객체 a가 private가 아니라면 단순 대입 가능
		System.out.println("original 객체 : " + original);
		System.out.println("복제 객체 : " + copy);
		System.out.println("=============================");
		
		
//		Point p1 = new Point(3, 4);
//		System.out.println(p1);
		
		// 클론을 하게 되면 객체를 무조건 형 변환 해줘야 함
		Point copy2 = (Point) original.clone();
		System.out.println("original 객체 : " + original);
		System.out.println("복제 객체 : " + copy2);
		System.out.println("=============================");
		
		copy2.y = 7;
		original.aa(100);
		System.out.println("original 객체 : " + original);
		System.out.println("복제 객체 : " + copy2);
		System.out.println("=============================");
	}

}
