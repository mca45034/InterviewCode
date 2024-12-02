package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class EvanOdd {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(2,4,6,9,7,5);
		l.stream().distinct().forEach(c->{
			if(c % 2 == 0) {
				System.out.println("even"+c);
			}else {
				System.out.println("odd"+c);
			}
		});
	}

}
