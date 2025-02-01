package Trees.Questions.BFS.Questions;

import java.util.*;

class TreeNode_103 {
    int val;
    TreeNode_103 left, right;

    TreeNode_103(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

public class Question_103_similar_to_102 {

    public List<List<Integer>> levelOrderBottom(TreeNode_103 root) {
        if (root == null) {
            return new ArrayList<>(); // Return an empty list instead of null
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode_103> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>(size);

            for (int i = 0; i < size; i++) {
                TreeNode_103 currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left); // Add left child once
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right); // Add right child once
                }
            }
            result.add(0, currentLevel); // Insert at the beginning for bottom-up order
        }
        return result;
    }

    public static void main(String[] args) {
        // Creating the tree
        TreeNode_103 root = new TreeNode_103(3);
        root.left = new TreeNode_103(9);
        root.right = new TreeNode_103(20);
        root.right.left = new TreeNode_103(15);
        root.right.right = new TreeNode_103(7);

        // Calling levelOrderBottom method
        Question_103_similar_to_102 obj = new Question_103_similar_to_102();
        List<List<Integer>> result = obj.levelOrderBottom(root);

        // Printing the result
        System.out.println("Bottom-Up Level Order Traversal: " + result);
    }
}
