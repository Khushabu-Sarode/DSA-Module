package UsingQ;

public class QusingLinkedlist {
	Node front;
	Node rear;
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void enqueue(int data) {
		Node newnode = new Node(data);
		if(front == null) {
			front = rear = newnode;
		}
		rear.next=newnode;
		rear = newnode;
	}
	
	public int dequeue() {
		int data = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
			return data;
		}
		return data;
	}
	public void display() {
		Node temp = front;
		while(temp!= null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
