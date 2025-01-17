package _04_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class T01_HashSet {
	public static void main(String args[]) {
		// 맵핑 구조를 만들순 없나
		// 마지막 Set 정보가 모든 Value 값에 적용되는 것을 해결못함
		
		// HashSet<>, Set<> : 모든 자료형을 다 받고자 할 때
		HashSet<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		
		set2.add("a");
		set2.add("b");
		set2.add("c");
		set2.add("d");
		
		System.out.println("set에 size : "+ set2.size());
		
		// set의 객체 얻어오기.
		// 순서가 없기 때문에 get(index)로 가져올 수 업다
		// Iterator 사용
		Iterator<String> iterator = set2.iterator();
		
		// 한번 돌면서 사용했기 때문에 iterator 공간에 남아 있는 것이 없음
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		System.out.println("=========================");
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		System.out.println("=========================");
		// 다시 이터레이터에 집어넣어서 다시 하나씩 꺼내씀
		/*
		 * Iterator는 주소를 하나씩 불러와 대입하는 방식으로
		 	remove를 이용시 주소 자체를 삭제한 것임으로 본 변수에서도 삭제됨
		 */
		
		iterator = set2.iterator(); 
		while(iterator.hasNext()) {
			String str = iterator.next();
			if(str.equals("b"))
				iterator.remove();
		}
		System.out.println("set에 size : "+ set2.size());
		System.out.println("=========================");
		iterator = set2.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
	}
}
