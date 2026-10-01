package UsingLinkedlist;

public class StackUsingLinkedlist {
	Node top;
    class Node{
    	int data;
    	Node next;
    	
    	Node(int data){
    		this.data = data;
    		this.next = null;
    	}
    }
    
    public void push(int data) {
    	Node newnode = new Node(data);
    	if(top == null) {
    		top = newnode;
    		return;
    	}
    	newnode.next = top;
    	top = newnode;
    }
    
    public void display() {
    	Node temp = top;
    	while(temp != null) {
    		System.out.println(temp.data);
    		temp = temp.next;
    	}
    }
    
    public int peek() {
    	if(top == null) {
    		System.out.println("Empty !!");
    	}
    	return top.data;
    }
    
    public int pop() {
    	Node temp = top;
    	top = top.next;
    	int data = temp.data;
    	temp.next = null;
    	return data;
    }
}
