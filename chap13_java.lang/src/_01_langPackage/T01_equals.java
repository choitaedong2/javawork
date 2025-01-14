package _01_langPackage;
class Equals{
	int value;
	Equals(int value) {
		this.value = value;
	}
	// 논리적 동등 객체는 hashCode()가 리턴하는 값도 같아야 함
	@Override // hashCode()도 같게 함
	public boolean equals(Object obj) {
		boolean b = value == ((Equals)obj).value;
		return b;
	}
	/* 바로 리턴해줘도 동일하다.
	@Override
	public boolean equals(Object obj) {
		return value == ((Equals)obj).value;;
	}
	 */
	
	
}
public class T01_equals {

	public static void main(String[] args) {
		// Equals 클래스에 빈 메소드가 없기에 값을 반드시 넣어야 함
		Equals e1 = new Equals(10);
		Equals e2 = new Equals(10);
		
		// Object클래스의 equals는 '주소가 같은가'의 결과가 나온다.
		// Object클래스의 equals는 '=='를 한 결과와 같다.
		if(e1.equals(e2)) // if(e1 == e2) 
			System.out.println("e1과 e2는 같다");
		else
			System.out.println("e1과 e2는 다르다.");
		// Equals 클래스에서 equals()를 값을 비교하는것으로 오버라이딩하고 난 후엔 값을 비교한 결과 출력		

		// equals() 오버라이딩과 상관없이 주소가 같은가?
		if(e1 ==e2)
			System.out.println("e1과 e2는 같다");
		else
			System.out.println("e1과 e2는 다르다.");
		
		String str = "홍길동";
		String str2 = "홍길동";
		if(str.equals(str2))
			System.out.println("str과 str2는 같다");
		else
			System.out.println("str과 str2는 다르다.");
				
	}

}
