package Basic;

public class PrimeNoinArray {

	public static void main(String[] args) {
		int[] a = {2, 4, 6, 7, 9, 13, 17}; 
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 2; j < a[i]; j++) {
				if(a[i]%2==0) {
					count++;
				}
				
			}
			if(count==0) {
				System.out.println(a[i]+" :prime");
			}else {
				System.out.println(a[i]+" :not prime");
			}
		}

	}

}
