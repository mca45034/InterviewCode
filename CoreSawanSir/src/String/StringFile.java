package String;

public class StringFile {
	public static void main (String[] args) {
		String str[]= {"rahul.java","dev.php","sharma.java","ram.c","krish.c"};
		for(int i=0;i<str.length;i++) {
			if(str[i].endsWith(".java")) {
				System.out.println(str[i]);
				
			}
			
		}
	}

}
