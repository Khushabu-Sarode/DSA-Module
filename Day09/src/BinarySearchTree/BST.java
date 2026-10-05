package BinarySearchTree;

class BSearchTree{
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public void insert(int data) {
		Node newnode = new Node(data);
		if(root == null) {
			root = newnode;
			return;
		}
		
		Node temp = root;
		while(true) {
			if(newnode.data < 
					temp.data) {
				if(temp.left == null) {
					temp.left = newnode;
					break;
				}
				temp = temp.left;
			}
			else {
				if(temp.right == null) {
					temp.right = newnode;
					break;
				}
				temp = temp.right;
			}
		}
		
	}
	
	public void inorder() {
		inOrder(root);
	}
	
	private void inOrder(Node root) {
		if(root == null) return;
		Node temp = root;
		inOrder(temp.left);
		System.out.print(temp.data + " " );
		inOrder(temp.right);
	}
	public void preorder() {
		preOder(root);
	}
	private void preOder(Node root) {
		if(root == null) return;
		Node temp = root;
		System.out.print(temp.data + " " );
		preOder(temp.left);
		preOder(temp.right);
	}
	public void postorder() {
		postOrder(root);
	}
	private void postOrder(Node root) {
		if(root == null) return;
		Node temp = root;
		postOrder(temp.left);
		postOrder(temp.right);
		System.out.print(temp.data + " " );
	}
	
}

public class BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSearchTree bs = new BSearchTree();
		
		bs.insert(50);
		bs.insert(30);
		bs.insert(70);
		bs.insert(20);
		bs.insert(40);
		bs.insert(60);
		bs.insert(80);
		
		bs.inorder();
		System.out.println("*************");
		bs.preorder();
		System.out.println("*************");
		bs.postorder();
		
	}

}
