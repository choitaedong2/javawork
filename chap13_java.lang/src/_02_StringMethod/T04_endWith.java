package _02_StringMethod;

// startWith(String) : 문자로 시작하는지 boolean 반환
// endWith(String) : 문자로 끝나는지 boolean 반환

public class T04_endWith {

	public static void main(String[] args) {
		String str = "javahtmlcssoracle";
		boolean flag = str.startsWith("java");
		boolean flag2 =  str.endsWith("cle");
		System.out.println(flag);
		System.out.println(flag2);
		System.out.println("======================");
		System.out.println(str.startsWith("java"));
		System.out.println("======================");
		if(str.startsWith("java"))
			System.out.println("java부터 배웁니다");
		else
			System.out.println("다른 언어부터 배웁니다.");
		
		//endWith
		String str2 = "img.jpg";
		
		if(str2.endsWith("png") || str2.endsWith("jpg"))
			System.out.println("그림 파일입니다.");
		else
			System.out.println("그림 파일이 아닙니다.");
	}

}
