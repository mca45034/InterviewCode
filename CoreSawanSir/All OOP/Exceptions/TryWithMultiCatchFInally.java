package Exceptions;

public class TryWithMultiCatchFInally {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		String s="rahul";
		try {
			for (int i = 0; i < s.length(); i++) {
				System.out.println(s.charAt(9));
			}
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[6]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}finally {
			System.out.println("i am finally block");
		}
	}

}
