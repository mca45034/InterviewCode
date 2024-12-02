package String;

public class OccurencString {
	
	public static void main(String[] args) {
		String s ="vijayDinanathchouchan";
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if(ch[i]!=ch[j]) {
					System.out.print(ch[j]);
				}
			}break;
		}
			
			
	}

}
