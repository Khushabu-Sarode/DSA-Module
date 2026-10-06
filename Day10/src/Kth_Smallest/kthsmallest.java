package Kth_Smallest;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class kthsmallest {

    static int count = 0;
    static int result = -1;

    static void inorder(Node root, int k) {
        if (root == null || count >= k) return;

        inorder(root.left, k);

        count++;
        if (count == k) {
            result = root.data;
            return;
        }

        inorder(root.right, k);
    }

    static int kthSmallest(Node root, int k) {
        count = 0;
        result = -1;
        inorder(root, k);
        return result; 
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        System.out.println(kthSmallest(root, 3)); // 4
    }
}
