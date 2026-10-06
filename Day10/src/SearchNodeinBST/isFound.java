package SearchNodeinBST;
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public boolean searchBST(TreeNode root, int key) {
        while (root != null) {
            if (root.val == key) return true;
            if (key < root.val) root = root.left;
            else root = root.right;
        }
        return false;
    }
}

public class isFound {
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        Solution s = new Solution();
        System.out.println(s.searchBST(root, 3));  
        System.out.println(s.searchBST(root, 5)); 
    }
}