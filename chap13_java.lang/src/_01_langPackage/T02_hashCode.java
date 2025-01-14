package _01_langPackage;
/*
 * 원래 Object클래스에 있는 hashCode()는 객체의 주소로 해시코드를 만든다
 * 
 * equals()를 오버라이딩하여 값으로 비교하도록 만들면
 	hashCode()도 오버라이딩하여 논리적으로 두 객체가 같도록 만들어 준다
 */
import java.util.Objects;

class Equals2{
	int value;
	Equals2(int value) {
		this.value = value;
	}
	// 논리적 동등 객체는 hashCode()가 리턴하는 값도 같아야 함
	/* 바로 리턴해줘도 동일하다.
	@Override // hashCode()도 같게 함
	public boolean equals(Object obj) {
		boolean b = value == ((Equals2)obj).value;
		return b;
	}
	*/
	@Override
	public boolean equals(Object obj) {
		return value == ((Equals2)obj).value;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(value); // 변수를 2개 만들었을 경우 hash(var1, var2)로 작성
	}
}
public class T02_hashCode {

	public static void main(String[] args) {
		// Equals2 클래스에 빈 메소드가 없기에 값을 반드시 넣어야 함
		Equals2 e1 = new Equals2(10);
		Equals2 e2 = new Equals2(10);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		// String 클래스에서 hashCode()를 오버라이딩 한 상태
		String s1 = new String("홍길동");
		String s2 = new String("홍길동");
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()); // 주소가 다르면 hash 코드도 달라야한다.
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2); // 오버라이딩을 통해 hash 코드가 오버라이딩 된 결과 : false
		
		// 원래 객체의 해시코드(고유)
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	}

}
