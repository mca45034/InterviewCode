package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindMaxSecondMaxNumberList {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(5);
		l.add(9);
		l.add(7);
		l.add(3);
		l.stream().sorted(Comparator.reverseOrder()).findFirst().ifPresent(e->System.out.println(e));
		l.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(e->System.out.println(e));
	}

}
