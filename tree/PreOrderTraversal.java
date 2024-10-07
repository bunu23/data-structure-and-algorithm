import java.util.Stack;

// implementing preorder traversal of Binary Tree
public class PreOrderTraversal {

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

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;

    }

    // Iterative Traversal
    public void preOrderIterative() {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }

    }

    // Recursive Traversal
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        PreOrderTraversal pt = new PreOrderTraversal();
        pt.createBinaryTree();
        pt.preOrder(pt.root);
        pt.preOrderIterative();
    }

}
