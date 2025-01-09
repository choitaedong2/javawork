package _06_ex;

class Excercise {
	public static Excercise str = new Excercise();
	
	public static Excercise getInstance() {
		return str;
	}
}

public class Excercise_main {
	
	public static void main(String[] args) {
	
	Excercise ex1 = Excercise.getInstance();
	Excercise ex2 = Excercise.getInstance();
	
	System.out.println("ex1 == ex2 : " + (ex1 == ex2));
	}
}