package Exceptions;

public class NumberOutOfBound {
	public static void main(String[] args) {
		String s="rahul123";
		try {
			int a=Integer.parseInt(s);
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
