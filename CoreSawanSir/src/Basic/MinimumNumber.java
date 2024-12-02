package Basic;

public class MinimumNumber {
	public static void main(String[] args) {
		int num=879534;
		int min=num%10;
		int tmp=0;
		while(num>0) {
			int rem=num%10;
			if(rem<min) {
				min=rem;
			}
			num=num/10;
		}
		System.out.println(min);
	}

}
