package Basic;

public class MissingNumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4};
		int tmp1=0,tmp2=0;
		for (int i = 0; i < a.length; i++) {
			tmp1=tmp1+a[i];
		}
		for (int i = 0; i < b.length; i++) {
			tmp2=tmp2+b[i];
		}
		System.out.println(tmp1-tmp2);
	}

}
