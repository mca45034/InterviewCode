package String;

public class Anagram {
	public static void main(String[] args) {
		String s1="Army";
		String s2="Maro";
		int count=0,flage=0;
		String str1=s1.toLowerCase();
		String str2=s2.toLowerCase();
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		for(int i=0;i<ch1.length;i++) {
			for(int j=i+1;j<ch1.length;j++) {
				if(ch1[i]>ch1[j]) {
					char tmp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=tmp;
				}
			}
		}
		System.out.println("orignal s : "+s1);
		System.out.println(ch1);
		for(int i=0;i<ch2.length;i++) {
			for(int j=i+1;j<ch2.length;j++) {
				if(ch2[i]>ch2[j]) {
					char tmp1=ch2[i];
					ch2[i]=ch2[j];
					ch2[j]=tmp1;
				}
			}
		}
		System.out.println("orignal s : "+s2);
		System.out.println(ch2);
		for(int i=0;i<ch2.length;i++) {
			if(ch1[i]==ch2[i]) {
				count++;
				flage=1;
			}
		}
		if(flage==1 && count==ch2.length) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}

}
