package Interface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

interface Parson{
	public final static String NAMES="Rahul kirar";
	public void  Ds(String school,String classs,Date dates);
	
}

public class ParsonMain implements Parson{
//	private String school;
//	private String classs;
//	private Date dates;
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;
//	}
//	public String getClasss() {
//		return classs;
//	}
//	public void setClasss(String classs) {
//		this.classs = classs;
//	}
//	public Date getDates() {
//		return dates;
//	}
//	public void setDates(Date dates) {
//		this.dates = dates;
//	}
//	public static String getNames() {
//		return NAMES;
//	}
	@Override
	public void Ds(String school, String classs, Date dates) {
		System.out.println(school);
		System.out.println(classs);
		System.out.println(dates);
		System.out.println(NAMES);
	}
	
	public static void main(String[] args) throws ParseException {
//		Parson p=new Parson();
//		p.setClasss("five");
//		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
//		p.setDates(sdf.parse("12-12-2009"));
//		p.setSchool("grttgrf");
//		System.out.println(p.getClasss());
//		System.out.println(p.getDates());System.out.println(p.getSchool());
	//	Parson p=new ParsonMain();
		
		ParsonMain p=new ParsonMain();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyy");
		
		p.Ds("rrr", "ttt", sdf.parse("12-12-2004"));
		
	}
	

}
