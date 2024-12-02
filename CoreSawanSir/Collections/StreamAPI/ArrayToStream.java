package StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
	public static void main(String[] args) {
		String str[]= {"sham","ram","dep"};
		Stream<String>stream=Arrays.stream(str);
		stream.sorted().distinct().forEach(System.out::println);
	}

}
