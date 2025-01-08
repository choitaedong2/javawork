package _01_access;

public class T01_access_main {

	public static void main(String[] args) {
		T01_access ac = new T01_access();
		ac.num = 10;
		System.out.println(ac.num);
		
//		System.out.println(ac.name); 접근 자체가 불가능
		// final 변수는 접근은 가능
		System.out.println(ac.PI);
		
//		ac.name = "김지원";
//		System.out.println(ac.name);
		ac.setName("김지원");
		System.out.println(ac.getName());
	}

}
