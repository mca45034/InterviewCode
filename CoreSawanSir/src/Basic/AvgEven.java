package Basic;

public class AvgEven {

	public static void main(String[] args) {
		int sum=0,count=0,avg=0;
		for (int i = 1; i < 100; i=i+2) {
			count++;
			sum=sum+i;
			avg=sum/count;
			
		}
		System.out.println(avg);
		System.out.println(sum);
		System.out.println(count);

	}

}
