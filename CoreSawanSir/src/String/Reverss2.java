package String;

public class Reverss2 {
	public static void main(String[] args) {
		String s="Rahul Kirar";
		String[] s1=s.split(" ");
		for(int i=0;i<=s1.length;i++) {
			for(int j=s1[i].length()-1;j>=0;j--) {
				System.out.print(s1[i].charAt(j));
			}
			System.out.print(" ");
		}
		
	}

}
