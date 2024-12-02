package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class ContestantWinner {

	String phoneNo;
	String name;

	public ContestantWinner(String phoneNo, String name) {

		this.phoneNo = phoneNo;
		this.name = name;

	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getName() {
		return name;
	}

}
 

public class ConstenstanWinnerTest {public static void main(String[] args) {

	List<ContestantWinner> list = new ArrayList<ContestantWinner>();

	list.add(new ContestantWinner("8985878546", "Shubham"));
	list.add(new ContestantWinner("7596325878", "Ramdulera"));
	list.add(new ContestantWinner("9865325478", "BhupendrJoggi"));
	list.add(new ContestantWinner("7536985245", "Punit"));
	list.add(new ContestantWinner("7896525369", "Binod"));
	list.add(new ContestantWinner("9856515475", "Baldew"));
	list.add(new ContestantWinner("8985878546", "Shubham"));

	list.stream().map(c -> c.getPhoneNo() + " " + c.getName()).distinct()

			.collect(Collectors.collectingAndThen(Collectors.toList(), c -> { Collections.shuffle(c); return c.stream(); 
			})).limit(3).forEach(c -> System.out.println(c));

}

}
