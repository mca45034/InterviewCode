package Construcor;

public class Account1 {
	double balance;
	

	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double diposite(int amt) {
		//System.out.println("youre balance is :"+balance);
		balance=balance+amt;
		//System.out.println("afer diposit balance :"+balance);
		return balance;
	}
	public double withdraw(int amt) {
		//System.out.println(balance);
		if(balance-1000<amt) {
			System.out.println("balance low");
		}else {
			balance=balance-amt;
			//System.out.println("withdrow balance after balance is :"+balance);
		}
		return balance;
	}


	public static void main(String[] args) {
		Account1 a=new Account1();
		a.setBalance(1000);
		//a.diposite(400);
		//a.withdraw(200);
		System.out.println("balance is :"+a.getBalance());
		System.out.println("diposit balance is...:"+a.diposite(400));
		System.out.println("withdraw after balance...."+a.withdraw(200));
		//System.out.println(a.diposite(500));

	}

}
