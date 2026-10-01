package DoublyList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyList d = new DoublyList();
		
		d.insertatBegin(10);
		d.insertatBegin(20);
		d.insertAtEnd(5);
		d.insertAtEnd(55);
		d.insertatBegin(30);
		d.display();
		System.out.print("********************");
//		d.displayBackward();
		d.insertAtposition(1, 101);
		d.display();
		System.out.print("after delete ---------->");
		d.deleteAtEnd();
		d.display();
		System.out.print("Delete at 2nd position ---------->");
		d.deleteAtposition(2);
		d.display();
	}

}
