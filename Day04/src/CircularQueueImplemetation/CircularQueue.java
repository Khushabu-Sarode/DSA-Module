package CircularQueueImplemetation;

public class CircularQueue {
    int queue[];
    int front;
    int rear;
    int count;
    int maxSize;
    
    public CircularQueue(int size) {
    	   this.maxSize= size;
    	   queue = new int[maxSize];
    	   front =0;
    	   rear = -1;
    	   count = 0;
    }
    public void enqueue(int data)
    { 
    	 
    	  if(count == maxSize) {
    		  System.out.println("Queue is full");
    	  }
    	   rear = (rear + 1) % maxSize;
    	   queue[rear] = data;
    	   count++;
    }
    public int dequeue()
    {
    	 if(count == 0) {
    		 System.out.println("Empty !!");
    	 }
    	  int data = queue[front];
      front = (front + 1) % maxSize;
    	  count--;
    	  return data;
    }
    
    public int peek() {
    	 return queue[front];
    }
    
}
