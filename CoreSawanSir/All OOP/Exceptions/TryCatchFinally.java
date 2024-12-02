package Exceptions;

public class TryCatchFinally {
	public static void main(String[] args) {
		String s="rahul";
		try {
			for (int i = 0; i < s.length(); i++) {
				System.out.println(s.charAt(8));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			//System.exit(0);
			System.out.println("i am finally block......");
		}
	}

}
