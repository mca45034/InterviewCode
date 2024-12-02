package String;

public class CountDublicate {
public static void main(String[] args) {
	String name="raahulkkirar";
	char ch[]=name.toCharArray();
	int count;
	for (int i = 0; i < ch.length; i++) {
		count=1;
		for (int j = i+1; j < ch.length; j++) {
			if(ch[i]==ch[j]) {
				count++;
			}
			
		}
		if(count>1) {
			System.out.println(ch[i]+"---"+count);
		}
		
		
	}
}
}
