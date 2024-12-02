package Imp;
class Account{
	int balance;

	public int getBalance() {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}
	public synchronized void diposit(int amt,String name) {
		int total=getBalance()+amt;
		setBalance(total);
		System.out.println(name+" "+getBalance());
	}
}
class Racing extends Thread{
	String name;
	public static Account account=new Account();
	public Racing(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			account.diposit(2000, name);
		}
	}
}

public class RacingConditionAccount {
	public static void main(String[] args) {
		Racing r=new Racing("rahul");
		Racing r1=new Racing("kirar");
		r.start();
		r1.start();
	
	}

}
