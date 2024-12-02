package String;

import java.util.Arrays;

public class ReverseString {
 public static void main(String[] args) {
	 String s="my name is rahul";
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(""+ch[i]);
		}
		for(int i=0;i<ch.length/2;i++) {
			char tmp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=tmp;
			//System.out.println(ch[i]);
			
		}
		s=Arrays.toString(ch);
		System.out.println(s);
	
 }
 
}
