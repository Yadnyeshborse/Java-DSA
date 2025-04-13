package Trees.Questions.DFS.Questions;

public class KtySamllesTNo_230 {

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        int count = 0;

        public int kthSmallest(TreeNode root, int k) {
            return helper(root, k).val;
        }

        private TreeNode helper(TreeNode root, int k) {
            if (root == null) return null;

            TreeNode left = helper(root.left, k);
            if (left != null) return left;

            count++;
            if (count == k) return root;

            return helper(root.right, k);
        }
    }

    // Utility method to build the example tree: [5,3,6,2,4,null,null,1]
    public static TreeNode buildSampleTree() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = buildSampleTree();
        int k = 3;

        int result = solution.kthSmallest(root, k);
        System.out.println("The " + k + "rd smallest element is: " + result);
    }
}

