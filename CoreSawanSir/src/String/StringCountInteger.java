package String;

public class StringCountInteger {
	public static void main(String[] args) {
		String s="rahulkirar@9211.com";
		String s1=s.replace("rahulkirar@9211.com", "9211");
		System.out.println(s1);
		
		int num=Integer.parseInt(s1);
		
		int rem=0,sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			
			num=num/10;
		}
		System.out.println(sum);
	}
	

}
