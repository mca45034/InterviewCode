package String;

public class importent {
	public static void main(String[] args) {
		String s[]= {"rahul kirar"};
		for (int i = 0; i < s.length; i++) {
			count(s[i]);
		}
		
	}
	static void count(String s) {
		char ch[]=s.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					
				}
			}
			if(count !=0) {
				System.out.println(ch[i]+"===="+count);
			}
		}
		
	}

}
