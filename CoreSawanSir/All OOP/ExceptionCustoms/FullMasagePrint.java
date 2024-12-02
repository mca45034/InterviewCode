package ExceptionCustoms;

public class FullMasagePrint {
	public static void main(String[] args) {
		String s="rahul";
		try {
			for (int i = 0; i < s.length(); i++) {
				System.out.println(s.charAt(9));
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			//System.out.println(e);
		}
	}

}
