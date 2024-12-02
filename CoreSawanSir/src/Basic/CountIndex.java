package Basic;

public class CountIndex {
	public static void main(String[] args) {

		int a[] = { 1, 3, 6, 8, 9 };
		int t=8;
		int p=0;
		for (int i = 0; i < a.length; i++) {
			if(t==a[i]) {
				p=i;
			}
		}
		System.out.println(p);
	}
}
