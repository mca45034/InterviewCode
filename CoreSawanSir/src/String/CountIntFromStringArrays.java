package String;

public class CountIntFromStringArrays {
	public static void main(String[] args) {
		String name = "Rahul Kirar";
		String name1=name.toLowerCase();
		char ch[]=name1.toCharArray();
		for(int i='a';i<='z';i++) {
			int count=0;
			for (int j = 0; j < ch.length; j++) {
				if(i==ch[j]) {
					count++;
					
				}
				
			}
			if(count !=0) {
			System.out.println((char)i+"===="+count);		
			}
		}
	}

}
