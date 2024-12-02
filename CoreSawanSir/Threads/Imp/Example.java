package Imp;
class Abc{
	int balance;

	public int getBalance() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}
	public synchronized void diposite(int amt,String name) {
		int total=getBalance()+amt;
		setBalance(total);
		System.out.println(getBalance()+" "+name);
	}
	
}
class Racingw extends Thread{
	String name;
	public static Abc abc=new Abc();
	public Racingw(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			abc.diposite(200, name);
		}
	}
}

	
public class Example extends Thread{
	public static void main(String[] args) {
	Racingw r=new Racingw("sss");
	Racingw r1=new Racingw("ddd");
	r.start();
	r1.start();
		
		
		
		
	}

}
