package dsa.stack.dynamicQueue;

import java.util.ArrayDeque;

public class Driver {
	public static void main(String[] args) {
		DynamicQueue q = new DynamicQueue();
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(5);
		System.out.println("Front of the queue: " + q.front());
		System.out.println("Back of the queue: " + q.back());
		q.dequeue();
		q.enqueue(4);
		q.dequeue();
		System.out.println("Front of the queue: " + q.front());
		System.out.println("Back of the queue: " + q.back());
		q.dequeue();
		q.dequeue();
		System.out.println("Front of the queue: " + q.front());
		System.out.println("Back of the queue: " + q.back());
		ArrayDeque<Integer> a;
	}
}
