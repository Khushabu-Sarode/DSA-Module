package DoublyList;

public class DoublyList {
	Node head;
	Node tail;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}	
	}
	
	public void insertAtEnd(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			tail = head = newnode;
			return;
		}
//		tail.next = newnode;
//		newnode.prev = newnode;
//		head = newnode;
		tail.next = newnode;
		newnode.prev = tail;
		tail = newnode;
	}
	
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public void insertatBegin(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			tail = head = newnode;
			return;
		}
		newnode.next = head;
		head.prev = newnode;
		head = newnode;
	}
	
	public void displayBackward() {
		Node temp = tail;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
	}
	
	public void insertAtposition(int position,int data) {
		Node newnode = new Node(data);
		Node current = head;
		for(int i=0;i<position - 1;i++) {
			current = current.next;
		}
		newnode.next = current.next;
		newnode.prev = current;
		current.next.prev = newnode;
		current.next = newnode;
	}

	public void deleteAtEnd() {
		tail = tail.prev;
		tail.next = null;
	}
	
	public void deleteAtposition(int position) {
		
		Node temp =head;
		for(int i=0;i<position-1;i++) {
			temp = temp.next;
		}
		Node todelete = temp.next;
		temp.next = todelete.next;
		todelete.prev = temp;
		todelete.next = null;
		todelete.prev = null;
	}
}
