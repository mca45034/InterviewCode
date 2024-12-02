package Exceptions;

public class StringOutOfBound {
	public static void main(String[] args) {
		String s="rahul";
		try {
			for (int i = 0; i < s.length(); i++) {
				System.out.println(s.charAt(12));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
