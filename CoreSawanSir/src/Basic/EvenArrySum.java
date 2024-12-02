package Basic;

public class EvenArrySum {
	public static void main(String[] args) {
		int arr[]= {11,12,13,14,15,16};
		int tmp=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				tmp=tmp+arr[i];
				System.out.println(arr[i]);
			}
			
		}
		System.out.println(tmp);
	}
}
