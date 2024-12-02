package String;

public class FindStringToDigit {

	public static void main(String[] args) {
     String []s= {"rahulkirar101214@gmail.com"};
     int count=0;
     for(String s1:s) {
    	 char ch[]=s1.toCharArray();
    	 for(int i=0;i<ch.length;i++) {
    		 if(Character.isDigit(ch[i])) {
    			 count=count+(Integer.parseInt(String.valueOf(ch[i])));
    			 
    		 }
    	 }
    	 System.out.println(count);
     }
	}

}
