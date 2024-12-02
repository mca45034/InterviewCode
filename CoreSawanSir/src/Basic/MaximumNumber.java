package Basic;

public class MaximumNumber {
	public static void main(String[] args) {
		int num=567934234;
		int max=num%10;
		while(num>0) {
			int rem=num%10;
			if(rem>max) {
				max=rem;
			}
			num=num/10;
		}
		System.out.println(max);
	}

}
