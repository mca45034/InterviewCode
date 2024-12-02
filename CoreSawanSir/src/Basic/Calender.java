package Basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
	Calendar c=Calendar.getInstance();
	for(int i=0;i<=1;i++) {
		c.add(Calendar.DATE, 5);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYY");
		System.out.println(sdf.format(c.getTime()));
	}

	}

}
