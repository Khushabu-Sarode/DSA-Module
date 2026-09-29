package CircularQueueImplemetation;

public class CircularQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		CircularQueue c = new CircularQueue(5);
		c.enqueue(10);
		c.enqueue(20);
		c.enqueue(30);
		c.enqueue(40);
		c.enqueue(50);
	
//	  System.out.println(c.peek());
	  c.dequeue();
	  c.dequeue();
	  c.dequeue();
	  c.dequeue();
	  c.dequeue();
	  System.out.println(c.peek());
	  c.dequeue();  
	  c.dequeue();
	}

}
