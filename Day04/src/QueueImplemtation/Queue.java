package QueueImplemtation;

public class Queue {

	private int queue[];
	private int front;
	private int rear;
	private int maxSize;
	
	public Queue(int size) {
		this.maxSize = size;
		this.queue = new int[maxSize];
		this.rear = -1;
		this.front = 0;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		rear =rear + 1;
		queue[rear] = data;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.print("Empty!!");
			return -1;
		}
		int data = queue[front++];
		return data;
	}
	

	
	public boolean isEmpty() {
		if(rear < front) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		return rear == maxSize-1;
	}
	public int peek() {
		return queue[front];
	}
}
