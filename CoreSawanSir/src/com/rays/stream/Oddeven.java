package com.rays.stream;

import java.util.Arrays;
import java.util.List;

public class Oddeven {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);

		l.stream().distinct().forEach(e -> {
			if (e % 2 == 0) {

				System.out.println(e + "oddd");

			} else {
				System.out.println(e + "even");
			}
		});
	}

}
