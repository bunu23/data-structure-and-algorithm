
public class ValidateBinarySearchTree {

    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(10);
        TreeNode second = new TreeNode(15);
        TreeNode third = new TreeNode(20);
        TreeNode fourth = new TreeNode(5);
        TreeNode fifth = new TreeNode(8);
        TreeNode sixth = new TreeNode(25);
        TreeNode seventh = new TreeNode(30);

        // Constructing the binary tree
        root = first; // Root node
        first.left = second; // Left child of root
        first.right = third; // Right child of root
        second.left = fourth; // Left child of second node
        second.right = fifth; // Right child of second node
        third.left = sixth; // Left child of third node
        third.right = seventh; // Right child of third node
    }

    public boolean isValid(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;

        }
        boolean left = isValid(root.left, min, root.data);
        if (left) {
            boolean right = isValid(root.right, root.data, max);
            return right;
        }
        return false;
    }

    public static void main(String[] args) {
        ValidateBinarySearchTree vbst = new ValidateBinarySearchTree();
        // Validate if the binary tree is a BST
        boolean isValidBST = vbst.isValid(vbst.root, Long.MIN_VALUE, Long.MAX_VALUE);

        // Print the result
        if (isValidBST) {
            System.out.println("The tree is a valid Binary Search Tree.");
        } else {
            System.out.println("The tree is NOT a valid Binary Search Tree.");
        }
    }
}