package _01_thread;

class Thread6 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}} System.out.println();}}

class Thread7 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}} System.out.println();}}

public class T06_Priority {

	public static void main(String[] args) {
		Thread6 t6 = new Thread6();
		Thread7 t7 = new Thread7();
		
		System.out.println(Thread.MAX_PRIORITY); // 10 : 우선순위가 가장 높음
		System.out.println(Thread.MIN_PRIORITY); // 1 : 우선순위가 가장 낮음
		System.out.println(Thread.NORM_PRIORITY); // 5 : deafault 값
		System.out.println();
		
		t6.setPriority(10);
		t7.setPriority(1);
		System.out.println("우선순위(+) : " + t6.getPriority());
		System.out.println("우선순위(-) : " + t7.getPriority());
		
		t6.start();
		t7.start();
	}

}
