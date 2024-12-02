package String;

public class StringWordCount {
	public static void main(String[] args) {
		String s = ("r1ah5u6l2k9ir2a4r");
		char ch[] = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (!Character.isDigit(ch[i])) {
				count++;
			}

		}
		System.out.println(s+"  "+count);
	}

}
