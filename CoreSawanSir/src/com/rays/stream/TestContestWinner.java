package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestWinner {

	public static void main(String[] args) {

		List<contestWinner> l = new ArrayList<contestWinner>();

		l.add(new contestWinner(2000, "sachin"));
		l.add(new contestWinner(2000, "kapil"));
		l.add(new contestWinner(2000, "rahul"));
		l.add(new contestWinner(2000, "mainsh"));
		l.add(new contestWinner(2000, "vishal"));
		l.add(new contestWinner(2000, "gourav"));
		l.add(new contestWinner(2000, "sachin"));

		l.stream().map(e -> e.getName() + " " + e.getSalary()).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), c -> {
					Collections.shuffle(c);
					return c.stream();
				})).limit(2).forEach(c -> System.out.println(c));
	}
}
