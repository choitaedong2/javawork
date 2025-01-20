package _08_comparable;
// compareTo()가 오버라이딩 되어있는 상태에서 사용

import java.util.Arrays;
import java.util.Comparator;


public class T02_Comparator {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		String str = Arrays.toString(strArr); // 배열을 스트링으로 변환
		System.out.println(str);
		Arrays.sort(strArr); // String Comparable구현에 의해 정렬(대문자가 앞에)
		System.out.println("strArr = "+Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자를 구분하지 않고 sort
		System.out.println("strArr = "+Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); // 아무것도 안하면 내림차순 정렬
		System.out.println("strArr = "+Arrays.toString(strArr));
	}

}
