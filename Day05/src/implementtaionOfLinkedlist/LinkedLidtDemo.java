package implementtaionOfLinkedlist;

public class LinkedLidtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList l = new LinkedList();
      
      l.addAtEnd(10);
      l.addAtEnd(20);
      l.addAtbegin(9);
      l.addAtbegin(30);
      l.addAtposition(2, 232);
      l.addAtposition(0, 212);
//      l.addAtposition(2, 232)/;
//      l.display();
//      l.deleteEnd();
       l.deleteAtPosition(-1);
       l.display();
       System.out.print("*************" + l.size() +" --------------------");      
//       Syste
//      l.deletefirst();
      
	}

}
