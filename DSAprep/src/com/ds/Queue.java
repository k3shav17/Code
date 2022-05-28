package com.ds;

/* A queue is a useful data structure in programming.
 * It is similar to the ticket queue outside a cinema hall,
 * where the first person entering the queue is the first person who gets the ticket.
 * 
 * Queue follow First In First Out principle (FIFO) - the item that goes in first,
 * comes out first.
 */
public class Queue {

	private int SIZE = 5;
	private int[] arr = new int[SIZE];
	private int front, rear;

	Queue() {
		front = -1;
		rear = -1;
	}

	public boolean isFull() {
		if (front == 0 && rear == SIZE - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (front == -1 && rear == -1) {
			return true;
		}
		return false;
	}

	public void enQueue(int element) {
		if (isFull()) {
			System.out.println("queue closed");
		} else {
			if (front == -1) {
				front = 0;
			}
			rear++;

			arr[rear] = element;
		}
	}

	public int deQueue() {

		int element;
		if (isEmpty()) {
			System.out.println("queue is empty, nothing to remove");
		}

		element = arr[front];
		if (front >= rear) {
			front = -1;
			rear = -1;
		} else {
			front++;
		}

		return element;
	}

	public void printQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			for (int i = front; i <= rear; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Queue queue = new Queue();

		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);

		queue.printQueue();

		System.out.println(queue.deQueue());

		queue.printQueue();
	}
}
