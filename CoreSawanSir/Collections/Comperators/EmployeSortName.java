package Comperators;

import java.util.Comparator;

public class EmployeSortName implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
