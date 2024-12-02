package Comperators;

import java.util.Comparator;

public class EmployeSortInt implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
//		if(o1.id<o2.id)
//			return 1;
//		else if(o1.id>o2.id)
//			return-1;
		if(o2.id==o1.id && o2.name.equals(o1.name)) {
			return o1.salary-o2.salary;
		}else {
		return o1.id-o2.id;
		}
	}

}
