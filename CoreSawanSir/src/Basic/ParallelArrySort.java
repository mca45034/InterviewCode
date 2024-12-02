package Basic;

import java.util.Arrays;

public class ParallelArrySort {
	public static void main(String[] args) {
		int a[]= {10,20,30,10,50,20,30};
		Arrays.parallelSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
