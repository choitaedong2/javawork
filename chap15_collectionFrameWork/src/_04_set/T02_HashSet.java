package _04_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class A {
	String aa;
	A(String aa) {
		this.aa = aa;
	}
}

public class T02_HashSet {
	public static void main(String[] args) {
		Set<A> set1 = new HashSet<>();
		A a1 = new A("c");
		
		set1.add(new A("a"));
		set1.add(new A("b"));
		set1.add(a1);
		set1.add(new A("d"));
		set1.add(new A("e"));
		
		System.out.println("size : " + set1.size());
		
		Iterator<A> iter = set1.iterator();
		while(iter.hasNext()) {
			A str = iter.next();
			System.out.print(str.aa + " "); // or toString Overriding 필요
		}
		System.out.println("-----------------------");
		
		set1.remove(a1); // 주소를 알고 있기 떄문에 삭제 가능
		iter = set1.iterator();
		
		// 계속 사용할거라서 아래에 메소드로 정의
		iterPrint(iter);
		System.out.println("-----------------------");
		
		// 삭제 불가 : 주소를 알수 없음
		set1.remove(new A("b")); // 주소를 알 방법이 없기에 삭제가 불가능
		iter = set1.iterator();
		iterPrint(iter);

		iter = set1.iterator();
		while(iter.hasNext()) {
			A str = iter.next();
			// String strA = str.aa;
			if(str.aa.equals("e"))
				iter.remove();
		}
		System.out.println("\ne 삭제 후 : ");
		iter = set1.iterator();
		iterPrint(iter);

	}  // main() 메소드 끝
	
	// iterator의 값 출력하는 메소드
	// void 임의 메소드명(Interator<A> 임의 변수명)
	static void iterPrint(Iterator<A> i) { // 인스턴스 메소드
		while(i.hasNext()) {
			A str = i.next();
			System.out.print(str.aa + " ");
		}
		System.out.println();
	}
} // class 끝 