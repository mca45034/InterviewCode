package Exceptions;

public class MultipleExceptionInSingleCatch {
	public static void main(String[] args) {
		String s="rahul";
       int a[]= {1,2,3,4};
		try {
			for (int i = 0; i < s.length(); i++) {
				System.out.println(s.charAt(9));
			}
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[9]);
			}
			
		} catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}finally {
			System.out.println("i am finally blockss....");
		}
	}

}
