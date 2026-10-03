package Singly;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist n1 = new linkedlist();
		n1.insertatend(55);
		n1.insertatbegin(10);
		n1.insertatbegin(20);
		n1.insertatbegin(15);
		n1.inseratposition(1, 235);
		n1.display();
		System.out.print(":**********:");
		n1.deleteatbegin();
		n1.display();
		System.out.print(":**********:");
		n1.deleteatend();
		n1.display();
		System.out.print(":**********:");
		n1.deletebyval(20);
		n1.display();
		
	}

}
