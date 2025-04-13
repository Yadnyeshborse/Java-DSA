package Trees.Questions.DFS.Questions;

public class MaxDiamter_543 {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNodeO root) {
        height(root);
        return maxDiameter;
    }

    // Helper method to calculate height and update maxDiameter
    private int height(TreeNodeO node) {
        if (node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Update max diameter if current diameter is larger
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // Return the height of current node
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
