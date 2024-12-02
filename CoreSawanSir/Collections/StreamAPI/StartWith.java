package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartWith {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("book.java","grg.php","eef.c");
		list.stream().map(e-> e.toLowerCase()).filter(e-> e.endsWith(".java")).distinct().sorted().forEach(System.out::println);
	}

}
