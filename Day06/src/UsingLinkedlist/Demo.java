package UsingLinkedlist;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsingLinkedlist l = new StackUsingLinkedlist();
		l.push(10);
		l.push(20);
		l.push(30);
		l.push(40);
		
		l.display();
		l.pop();
		System.out.println(l.peek());
		l.pop();
		l.display();
	}

}
