package Exceptions;

public class ArryOutBounds {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		try {
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[8]);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
