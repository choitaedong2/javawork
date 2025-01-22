package _02_ExcutionControl;

public class Bank {
	private int balance = 10000;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) { //synchronized
		if(balance >= money ) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance -= money;
		}
	}
}
