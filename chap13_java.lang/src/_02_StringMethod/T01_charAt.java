package _02_StringMethod;
// charAt(index) : index 번호에 해당하는 문자 1개 반환

public class T01_charAt {

	public static void main(String[] args) {
		String sn = "980203-1728394";
		char s = sn.charAt(7);
		
		switch(Integer.parseInt(String.valueOf(s))) {
		case 1 : case 3:
			System.out.println("남자");
			break;
		case 2 : case 4: // default
			System.out.println("여자");
			break;
		}
	}

}