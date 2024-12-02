package com.rays.stream;

import java.util.Arrays;

public class minummaxinmum {

	public static void main(String[] args) {

		int i[] = { 1, 2, 3, 4, 5 };

		Arrays.stream(i).max().ifPresent(e -> System.out.println(e));
	}

}
