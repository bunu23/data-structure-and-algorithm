
// Implementing binary tree in java
public class BinaryTree {

    private TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(3);
        TreeNode second = new TreeNode(4);
        TreeNode third = new TreeNode(5);
        TreeNode fourth = new TreeNode(6);
        TreeNode fifth = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;

    }

    public static void main(String[] args) {

    }

}
