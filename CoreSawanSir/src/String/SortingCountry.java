package String;

public  class SortingCountry {

	public static void main(String[] args) {
		String s[]= {"zebra","agar","man"};
		
		for (int i = 0; i < s.length; i++) {
			for(int j = i + 1;j<s.length;j++) {
				if(s[i].charAt(0)>s[j].charAt(0)) {
					
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
					
					
				}
				
			}
			System.out.println(s[i]);
			
			
		}
		

	}

}
