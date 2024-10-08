
import javax.swing.tree.TreeNode;
import java.util.Stack;

public class PostOrderTraversal {
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

    // Iterative demo

    public void postOrderTraversal(TreeNode root) {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.println(temp.data);
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.println(temp.data);
                    }
                } else {
                    current = temp;
                }
            }
        }
    }

    // Recursive code
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        PostOrderTraversal pt = new PostOrderTraversal();
        pt.createBinaryTree();
        pt.postOrder(pt.root);
        System.out.println();
        pt.postOrderTraversal(pt.root);
    }
}
