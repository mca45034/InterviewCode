package StreamAPI;

import java.util.Arrays;

public class MaxArrayMinArray {
	public static void main(String[] args) {
		int i[]= {2,4,6,3,1};
		Arrays.stream(i).min().ifPresent(e -> System.out.println(e));
		Arrays.stream(i).max().ifPresent(e1 -> System.out.println(e1));
	}

}
