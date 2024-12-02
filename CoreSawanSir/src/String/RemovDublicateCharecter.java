package String;

public class RemovDublicateCharecter {
	public static void main(String[] args) {
		String s = "rahul kirar";
		//char ch[]=s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			int a=s.indexOf(ch,i+1);
			if(a==-1) {
				System.out.print(ch);
			}
		}
	}

}
