package String;

public class CountDublicate2 {
	public static void main(String[] args) {
		String s="by the end of century by the revolution took please this time";
	       char ch[]=s.toCharArray();
	       
	       for(int i=0;i<ch.length;i++) {
	    	   int count=0;
	    	   for(int j=i+1;j<ch.length;j++) {
	    		   if(ch[i]==ch[j])
	    			   count++;
	    		   ch[j]='\0';
	    	   }
	    	   if(ch[i] !='\0') {
	    		   System.out.println(ch[i]+"-----"+count);
	    	   }
	       }
	}

}
