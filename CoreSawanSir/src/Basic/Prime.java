package Basic;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number....");
		int num=sc.nextInt();
		//int num=8;
		int count=0;
		for (int i = 2; i <num; i++) {
			if(num%2==0) {
				count++;
			}
			
		}
		if(count==0) {
			System.out.println("prime number :"+num);
		}else {
			System.out.println("not prime number :"+num);
		}
	}
	

}
