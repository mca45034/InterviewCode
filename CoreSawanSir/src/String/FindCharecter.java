package String;

import java.util.Scanner;

public class FindCharecter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		char sr =sc.next().charAt(0);
		
		String s="by the end century the revolution took please";
		char ch[] = s.toCharArray();
		int flage=0;
		for( int i=0;i<ch.length;i++) {
			if(ch[i]==sr) {
				flage++;
			}
		}
		if(flage==1) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		
		
	}

}
