package implementtaionOfLinkedlist;

class Node {
	   public int data;
	    Node next;
	    
	    Node(int data){
	    	  this.data = data;
	    	  this.next = null;
	    	}
}

public class LinkedList {

	Node head;
	int count;
	
	public void addAtEnd(int data) {
		Node newnode = new Node(data);
		count++;
		if(head == null) {
			head = newnode;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newnode;
		
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void addAtbegin(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
	}
	public void addAtposition(int position,int data) {
		Node newnode = new Node(data);
		count++;
		if(position == 0) {
			addAtbegin(data);
			return;
		}
		if(position == count) {
			addAtEnd(data);
			return;
		}
		
		Node temp = head;
		for(int i=0;i<position - 1; i++) {
			temp = temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}
	
	public int size() {
		return count;
	}
	
	public void deleteEnd() {
		Node temp = head;
		while(temp.next.next != null) {
			temp= temp.next;
		}
		temp.next=null;
		count--;
	}
	
	public void deletefirst() {
		head = head.next;
		count--;
	}
	
	public void deleteAtPosition(int position) {
	   if(position == 0) {
		   deletefirst();
		   return;
	   }
	   if(position == count) {
		   deleteEnd();
		   return;
	   }
	   if(position > size()) {
	      System.out.println("invalid position ");
	   }
	   Node temp = head;
	   for(int i=0;i<position-1;i++) {
		   temp = temp.next;
		   
	   }
	   temp.next = temp.next.next;
	   count--;
	}
}
