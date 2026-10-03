package Singly;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class linkedlist {
   
	Node head;
	int count;
	
	public void insertatend(int data) {
		Node newnode = new Node(data);
		count++;
		if(head == null) {
			head = newnode;
			return;
		}
	
		Node temp = head;
		while(temp.next != null) {
		   temp=temp.next ;
		}
		temp.next = newnode;
	}
	
	public void insertatbegin(int data) {
		Node newnode = new Node(data);
		
		if(head == null) {
			head = newnode;
			return;
		}
		
		newnode.next = head;
		head = newnode;
	}
	
	public void inseratposition(int position,int data) {
		
		Node newnode = new Node(data);
		count++;
		if(head == null) {
			head = newnode;
			return;
		}
		
		if(position == 0) {
			insertatbegin(data);
			return;
		}
		if(position == count) {
			insertatend(data);
			return;
		}
		Node temp= head;
		for(int i=0;i<position-1;i++) {
			temp = temp.next;
		}
	     newnode.next = temp.next;
	     temp.next = newnode;
	}
	
	public void deleteatbegin() {
		head = head.next;
	}
	public void deleteatend() {
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}
	public void deletebyval(int val) {
		
		Node temp = head;
		while(temp.next.data != val) {
			temp = temp.next;
		}temp.next = temp.next.next;
		
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
}
