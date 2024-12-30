package chap02_variable;

public class 자리바꿈_03 {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		// x에 y값, y에 x값을 넣고 싶을 때
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("x="+x);
		System.out.println("y="+y);

	}

}
