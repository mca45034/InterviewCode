package Basic;

public class MethodCallings {
	public static int index(int [] num,int a) {
		for (int i = 0; i < num.length; i++) {
			if(a==num[i]) {
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int num[]= {10,20,30,40,50};
		int a=301;
		int index=index(num,a);
		if(index != -1) {
			System.out.println(index);
		}else {
			System.out.println(index);
		}
		
	}

}
