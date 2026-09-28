package Stack;

public class Stack {
     
	private int maxsize;
	private int [] arr;
	private int top;
	
	Stack(int size){
		this.maxsize = size;
		arr = new int[maxsize];
		top = -1;
	}
	public boolean isFull() {
		return top == maxsize - 1;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public void push(int data) {

		if(!isFull()) {
			 top++;
	         arr[top] = data;
		}
	  

	}	
	public int pop() {
		if(!isEmpty()) {
			return arr[top--];			
		}
		return -1;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.print("stack is empty");
		}
		return arr[top];
	}
	public void display() {
		while(!isEmpty()) {
			if (arr[top] != -1){
				System.out.print(arr[top]);
				
			}
		}
	}
}
