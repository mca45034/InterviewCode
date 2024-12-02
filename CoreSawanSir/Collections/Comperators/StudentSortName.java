package Comperators;

import java.util.Comparator;

public class StudentSortName {

	
	 public static Comparator<Student> compareById = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			if(o1.id>o2.id)
				return 1;
			else if(o1.id<o2.id)
				return -1;
			return 0;
		}
	       
	    };
	    public static Comparator<Student> SortByFee=new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o2.fee<o1.fee)
					return 1;
				else if(o2.fee>o1.fee)
					return-1;
				return 0;
			}
		};
//		public static Comparator<Student> SortName=new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return o2.getName().compareTo(o1.getName());
//			}
//			
//		};

}
