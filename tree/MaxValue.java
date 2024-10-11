// finding maximum value in Binary Tree
public class MaxValue {

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

    public int findMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if (left > result) {
            result = left;

        }
        if (right > result) {
            result = right;
        }
        return result;
    }

    public static void main(String[] args) {
        MaxValue maxValue = new MaxValue();
        maxValue.createBinaryTree();
        System.out.println(maxValue.findMax(maxValue.root));
    }
}
