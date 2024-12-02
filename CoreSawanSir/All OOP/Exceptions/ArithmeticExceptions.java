package Exceptions;

public class ArithmeticExceptions {
	public static void main(String[] args) {
		int a=10;
		try {
			a=10/0;
			System.out.println(a);
			System.exit(0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
