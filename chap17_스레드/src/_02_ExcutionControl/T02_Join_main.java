package _02_ExcutionControl;

public class T02_Join_main {

	public static void main(String[] args) {
		SumThread sumTh = new SumThread();
		sumTh.start();
		
		try {
			sumTh.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1~1000까지의 합" + sumTh.getSum());
	}

}
