import java.util.Stack;

// Implementing Inorder traversal of binary tree
public class InOrderTraversal {

    private TreeNode root;

    public class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

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

    // Iterative Way
    public void inOrderTraversal() {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.println(temp.data);
                temp = temp.right;
            }
        }

    }

    // traversing recursive
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        InOrderTraversal vt = new InOrderTraversal();
        vt.createBinaryTree();
        System.out.println("Recursive way");
        vt.inOrder(vt.root);
        System.out.println();
        System.out.println("Iterative way");
        vt.inOrderTraversal();
    }
}
