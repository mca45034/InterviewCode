package Exceptions;

public class TryFinally {

	public static void main(String[] args) {
		int a=10;
		try {
			int c=a/2;
			System.out.println(c);
		} finally {
			System.out.println("handle finally clause");
		}

	}

}
