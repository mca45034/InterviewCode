package Basic;

public class AvgOdd {
	public static void main(String[] args) {
		int count=0,avg=0,sum=0;
		for(int i=1;i<100;i=i+2) {
			count++;
			sum=sum+i;
			avg=sum/count;
		}
		System.out.println(count);
		System.out.println(avg);
		System.out.println(sum);
	}

}
