package Construcor;

import java.util.Scanner;

public class Account {
	double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void diposit(int amt) {
		System.out.println("youre account balance ...: " + balance);
		System.out.println("Diposit amount is ..... : " + amt);
		balance = balance + amt;
		System.out.println("Diposit after Balance....: " + balance);
	}

	public void withdrow(int amt1) {
		if ((balance - 1000) < amt1) {
			System.out.println("youre balance is low ....");
		} else {
			System.out.println("total balance is... : " + balance);
			System.out.println("withdrow amount is... : " + amt1);
			balance = balance - amt1;
			System.out.println("after withdraw amount .... : " + balance);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice =0;
		do {
			System.out.println("===================================");
			System.out.println("Enter youre Choice... ");
			System.out.println("Diposit press (1)");
			System.out.println("withdraw amount press (2)");
			System.out.println("Exit press (3)");
			 choice = sc.nextInt();
			Account a = new Account();
			a.setBalance(1000);
		switch (choice) {
		case 1:
			System.out.println("Enter diposit amount..");
			int amt = sc.nextInt();
			a.diposit(amt);
			break;

		case 2:
			System.out.println("Enter withdraw amount..");
			int amt1 = sc.nextInt();
			a.withdrow(amt1);
			break;

		case 3:
			System.exit(0);

		}
		}while(choice !=3);
	}
}