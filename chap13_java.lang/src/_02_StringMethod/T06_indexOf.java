package _02_StringMethod;

// 오버로딩 되어 있음
/*
 * indexOf() : 앞에서부터 확인
 * indexOf(char) : 글자의 index번호 반환
 * indexOf(char, fromIndex) : fromIndex번호부터 글자가 있나 확인 후 index번호 반환
 * indexOf(String) : 문자열의 시작 index번호 반환
 * indexOf(String, fromIndex) : fromIndex번호부터 문자열이 있나 확인 후 index번호 반환
 * 
 * lastIndexOf() : 뒤에서부터 확인
 * lastIndexOf(char)
 * lastIndexOf(char, fromIndex)
 * lastIndexOf(String) : 뒤에서부터 문자열을 확인 후 index번호 반환
 * lastIndexOf(String, fromIndex)
 */
public class T06_indexOf {

	public static void main(String[] args) {
		String str = "java programming vaja";
		int index = str.indexOf('a');
		System.out.println("a의 index번호 : " + index);
		index = str.indexOf('a',5);
		System.out.println("5번 index 이후에 나오는 a의 index번호 : "+ index);
		
		index = str.indexOf("gra");
		System.out.println("gra가 시작되는 index번호 : " + index);
		index = str.indexOf("va", 5);
		System.out.println("va가 시작되는 index번호 : " + index);
		
		if(str.indexOf("java")==-1) // (str.indexOf("java")<0) 
			System.out.println("자바 프로그램이 아닙니다.");
		else
			System.out.println("자바 프로그램입니다.");
		
		System.out.println(str.lastIndexOf('j'));
	}

}
