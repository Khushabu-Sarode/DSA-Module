package Linkedlist;

public class CircularList {
    Node tail;
    class Node{
    	int data;
    	Node next;
    	public Node(int data) {
    		this.data = data;
    		this.next = null;
    	}
    }
    
    public void insertAtEnd(int data) {
    	Node newnode = new Node(data);
    	if(tail == null) {
    		tail = newnode;
            return;
    	}
    	
    	newnode.next = tail.next;
    	tail.next = newnode;
    	tail = newnode;
    }
    
    public void display() {
    	Node temp = tail.next;
    	do {
    		System.out.print(temp.data);
    		temp = temp.next;
    	}while(temp != tail.next);
    }
    
}
