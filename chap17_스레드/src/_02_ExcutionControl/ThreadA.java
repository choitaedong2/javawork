package _02_ExcutionControl;

public class ThreadA extends Thread {
	boolean stop = false;	// thread 종료시 사용
	boolean work = true;	// yield 메소드 호출한 시점을 알기 위해 사용
	static int count = 0;
	
	@Override
	public void run() {
		while(!stop) {
			count++;
			if(work) {
				System.out.println("ThreadA 작업하기 : " + count);
			} else {
				Thread.yield(); // 작업을 하지 않을 때 다른스레드에게 양보
			}
		}
		System.out.println("ThreadA 종료");
	}
}
