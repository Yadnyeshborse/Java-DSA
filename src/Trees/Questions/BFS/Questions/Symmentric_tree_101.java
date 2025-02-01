package Trees.Questions.BFS.Questions;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode_101 {
    int val;
    TreeNode_101 left;
    TreeNode_101 right;

    TreeNode_101(int val) {
        this.val = val;
    }
}

public class Symmentric_tree_101 {
    // https://leetcode.com/problems/symmetric-tree/description/
    public boolean isSymmetric(TreeNode_101 root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode_101> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            TreeNode_101 left = queue.poll();
            TreeNode_101 right = queue.poll();

            if (left == null && right == null) {
                continue;
            }

            if (left == null || right == null) {
                return false;
            }

            if (left.val != right.val) {
                return false;
            }

            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Symmentric_tree_101 tree = new Symmentric_tree_101();

        // Creating a symmetric tree:
        //         1
        //       /   \
        //      2     2
        //     / \   / \
        //    3   4 4   3
        TreeNode_101 root = new TreeNode_101(1);
        root.left = new TreeNode_101(2);
        root.right = new TreeNode_101(2);
        root.left.left = new TreeNode_101(3);
        root.left.right = new TreeNode_101(4);
        root.right.left = new TreeNode_101(4);
        root.right.right = new TreeNode_101(3);

        boolean result = tree.isSymmetric(root);
        System.out.println("Is the tree symmetric? " + result);
    }
}
