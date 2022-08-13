package com.bl.Stacks;

public class QueueMain {
	public static void main(String[] args) {

		// Create a queue of capacity 3
		Queue queue = new Queue(3);

		System.out.println("Initial Queue:");
		// print Queue elements
		queue.display();

		// inserting elements in the queue
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);

		// print Queue elements
		System.out.println("Queue after Enqueue Operation:");
		queue.display();
	}

}
