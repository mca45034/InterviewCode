package String;

public class IndexReplace {
	public static void main(String[] args) {
		String s="RAHUL KUMAR KIRAR";
		char ch[]=s.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U') {
				ch[i] = '0';
				
			}
			
		}
		System.out.println(ch);
}
}