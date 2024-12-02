package ExceptionCustoms;
class CustomException extends Exception{
	public CustomException(String msg) {
		super(msg);
	}
}
class Account{
	double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double deposite(int amt) {
		balance=balance+amt;
		return balance;
	}
	public double withdrow(int amt) throws CustomException {
		if(balance-1000<amt) {
			CustomException e=new CustomException("amount less then 1000....");
			throw e;
		}else {
			balance=balance-amt;
		}
		return balance;
	}
}

public class AccountsMain {
	public static void main(String[] args) {
		Account a=new Account();
		a.setBalance(1000);
		System.out.println(a.getBalance());
		//a.deposite(200);
		System.out.println(a.deposite(200));
		try {
			a.withdrow(300);
			System.out.println(a.getBalance());
		} catch (CustomException e) {
			System.out.println(e);
			
		}
	}

}
