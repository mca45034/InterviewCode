package StreamAPI;

import java.util.stream.Stream;

public class StreamToArrays {
	public static void main(String[] args) {
		Stream<String>stream=Stream.of("sfs","hh","kjh");
		String []arry=stream.toArray(e -> new String[e]);
		for (String string : arry) {
			System.out.println(string);
		}
		}
	

}
