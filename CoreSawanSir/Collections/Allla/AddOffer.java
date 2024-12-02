package Allla;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class AddOffer {
	public static void main(String[] args) {
		Queue q1 = new ArrayBlockingQueue(2);
		q1.offer(1);
		q1.offer(2);
		q1.offer(3);
		System.out.println(q1);

		Queue q = new ArrayBlockingQueue(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		System.out.println(q);
	}

}
