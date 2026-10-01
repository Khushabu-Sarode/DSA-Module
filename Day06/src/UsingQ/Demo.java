package UsingQ;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QusingLinkedlist q = new QusingLinkedlist();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		
		q.display();
		
		System.out.println("**********************************\n");
		
		q.dequeue();
		q.display();
		
		

	}

}
