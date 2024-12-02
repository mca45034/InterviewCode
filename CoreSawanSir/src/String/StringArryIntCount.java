package String;

public class StringArryIntCount {
	static void  integer(String s) {
		char ch[]=s.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if(Character.isDigit(ch[i])) {
				count++;
			}
		}
		System.out.println(s+"======"+count);
		
	}
	public static void main(String[] args) {
		String []s= {"rahul921157","kumar4567","kira54354755r"};
		for (int i = 0; i < s.length; i++) {
			integer(s[i]);
		}
	}

}
