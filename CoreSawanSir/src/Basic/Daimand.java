package Basic;

public class Daimand {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 5-i; j >0; j--) {
				System.out.print(" ");
				
			}
			for (int j = i; j >0; j--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for (int i = 5-1; i >=1; i--) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
