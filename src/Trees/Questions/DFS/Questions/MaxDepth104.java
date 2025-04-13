package Trees.Questions.DFS.Questions;

public class MaxDepth104 {

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Solution class with the maxDepth method
    static class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;

            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            return Math.max(left, right) + 1;
        }
    }

    public static void main(String[] args) {
        // Create a sample binary tree:
        //         1
        //        / \
        //       2   3
        //      /
        //     4

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        Solution solution = new Solution();
        int depth = solution.maxDepth(root);

        System.out.println("Maximum Depth of Binary Tree: " + depth);
    }
}

