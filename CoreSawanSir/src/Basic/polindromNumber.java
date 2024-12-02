package Basic;

public class polindromNumber {
	public static void main(String[] args) {
		int num=121;
		int sum=0;
		int tmp=num;
		while(num>0) {
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(sum==tmp) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
