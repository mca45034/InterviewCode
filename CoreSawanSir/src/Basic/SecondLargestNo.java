package Basic;

public class SecondLargestNo {
	public static void main(String[] args) {
		int num[]= {56,67,89,77,123,55,11};
		int tmp=0;
		int count=0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]>tmp) {
				count=tmp;
				tmp=num[i];
			}if(count<num[i]&&num[i]<tmp) {
				count=num[i];
			}
		}
		System.out.println(count);
	}

}
