package _02_static;

public class T01_static_main {

	public static void main(String[] args) {
		/*
		 * T01_static ts1 = new T01_static(); ts1.println(); ts1.printSt();
		 * 
		 * ts1.num =10; ts1.numSt = 100; System.out.println(ts1.num);
		 * System.out.println(ts1.numSt);
		 * 
		 * T01_static ts2 = new T01_static(); System.out.println(ts2.num);
		 * System.out.println(ts2.numSt); ts2.println(); ts2.printSt();
		 */
		// Static(정적) 변수는 별도의 정적 공간에 메모리를 저장함으로 클래스로 불러올 수 있다.
		// 정적 필드는 객체를 생성하지 않고도 사용가능
		System.out.println(T01_static.numSt);
		System.out.println(T01_static.nameSt);
		T01_static.printSt();
	}

}
