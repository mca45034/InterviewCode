package String;

public class StringInVovelCons {
	public static void main(String[] args) {
	String str="by the end centuryn nthe revolution took please this time in hance france";
	String str1=str.toLowerCase();
	char[] ch=str1.toCharArray();
	int Vcount=0;
	int Ccount=0;
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ) {
			System.out.print(ch[i]+" ");
			Vcount++;
		}
		else {
			Ccount++;
			//System.out.print(ch[i]+" &&");
		}
	}
	System.out.println(Vcount);
	System.out.println(Ccount);
	System.out.println(ch.length);
	}
	
}
