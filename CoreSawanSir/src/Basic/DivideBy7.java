package Basic;

public class DivideBy7 {
	public static void main(String[] args) {
		int count=0;
		for(int i=100;i<200;i++) {
			if(i%7==0) {
				count=count+i;
				System.out.println(i);
			}
			
		}
		System.out.println(count);
	}

}
