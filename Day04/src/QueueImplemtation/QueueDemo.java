package QueueImplemtation;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Queue queue = new Queue(5);
     queue.enqueue(10);
     queue.enqueue(20);
     queue.enqueue(30);
     queue.enqueue(40);
     queue.enqueue(50);
     
//     System.out.println(queue.dequeue());
//     System.out.println(queue.dequeue() );
     
     System.out.print(queue.peek());
//     System.out.println(queue.dequeue());
//     System.out.println(queue.dequeue());
//     System.out.println(queue.dequeue());
	}

}
