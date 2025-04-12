package Trees.Questions.DFS.Questions;



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MaxDiameter_543 {

    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }

    // Helper method to calculate height and update maxDiameter
    private int height(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Update max diameter if current diameter is larger
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // Return the height of current node
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        // Constructing the sample binary tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        MaxDiameter_543 solution = new MaxDiameter_543();
        int result = solution.diameterOfBinaryTree(root);
        System.out.println("Diameter of the binary tree is: " + result);
    }
}

