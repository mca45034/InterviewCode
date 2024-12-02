package Allla;

import java.util.ArrayDeque;
import java.util.Deque;

public class DqueueMethods {
	public static void main(String[] args) {
		Deque d=new ArrayDeque();
		d.offer(2);
		d.offer(3);
		d.offer(4);
		d.offer(6);
		d.offer(6);
		d.offer("dddd");
		d.offer(null);
		//d.add(null);
		
		System.out.println(d);
		System.out.println(d.offerLast(88));
		System.out.println(d);
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		System.out.println(d.peek());
		System.out.println(d.poll());
		System.out.println(d.pop());
		System.out.println(d);
		System.out.println(d.pollFirst());
		System.out.println(d);
		
	}

}
