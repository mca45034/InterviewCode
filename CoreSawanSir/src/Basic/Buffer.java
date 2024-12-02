package Basic;

public class Buffer {

	public static void main(String[] args) {
		 StringBuffer sb=new StringBuffer();    
	        System.out.println(sb.capacity());//default 16    
	        sb.append("Hello");    
	        System.out.println(sb.capacity());//now 16    
	        sb.append("Hello");   
	        System.out.println(sb.capacity());//now (34*2)+2=70   
	        sb.append("Helloujtyuyuytuytbuyuyty");   
	        System.out.println(sb.capacity());//now (34*2)+2=70   
	        sb.append("hy");
	        System.out.println(sb.capacity());
//	      
	        
	}

}
