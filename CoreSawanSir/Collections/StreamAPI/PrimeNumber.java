package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
	public static boolean isPrime(int a) {
		int count=0;
		if(a==1) {
			return false;
		}
		
		for (int i = 2; i < a; i++) {
			if(a % i ==0) {
				count++;
			}
			
		}
		return count== 0;
	}
	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		l.add(4);
		l.add(5);
		l.add(3);
		l.add(8);
		//l.stream().distinct().filter(e-> isPrime(e)).forEach(e->System.out.println(e+"prime"));
		l.stream(). distinct().filter(e -> isPrime(e)).forEach(e -> System.out.println(e));
		}

}
