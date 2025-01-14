package _02_StringMethod;

// replace(기존문자, 바꿀문자) : 기존문자를 바꿀문자로 바꾸기
// replaceAll(기존문자, 바꿀문자) : 기존문자를 바꿀문자로 바꾸기(정규표현식 때 추가 설명)
// replaceFirst(기존문자, 바꿀문자) : 맨처음 문자를 바꿀문자로 바꾸기(정규표현식 때 추가 설명)
// return 값이 바꾼 문자열을 반환
public class T07_replace {

	public static void main(String[] args) {
		String str = "javaprogramming java awsjava dajava";
		
		String reStr = str.replace("m", "abc");
		System.out.println(reStr);
		
		String str2 = "javapro jeava aws java dajva";
		System.out.println(str2.replace("java", "자바")); // 정규표현식을 반영하지 못해 정확한 문자가 들어가야함
		System.out.println(str2.replaceAll("java", "자바"));
		System.out.println(str2.replaceFirst("java", "자바"));
	}

}
