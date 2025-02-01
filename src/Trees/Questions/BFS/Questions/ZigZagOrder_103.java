package Trees.Questions.BFS.Questions;

import java.util.*;

class TreeNode_199 {
    int val;
    TreeNode_103 left, right;

    TreeNode_199(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
public class ZigZagOrder_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode_103 root) {
        if (root == null) {
            return new ArrayList<>(); // Return an empty list if the tree is empty
        }

        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode_103> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>(size);

            for (int i = 0; i < size; i++) {
                if (!reverse) {
                    // Normal order (left to right)
                    TreeNode_103 currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val);

                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }
                } else {
                    // Reverse order (right to left)
                    TreeNode_103 currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);

                    if (currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        queue.addFirst(currentNode.left);
                    }
                }
            }
            // After finishing this level, toggle the reverse flag
            reverse = !reverse;
            result.add(currentLevel);
        }

        return result;
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode_103 root = new TreeNode_103(3);
        root.left = new TreeNode_103(9);
        root.right = new TreeNode_103(20);
        root.right.left = new TreeNode_103(15);
        root.right.right = new TreeNode_103(7);

        // Creating an instance of the class
        ZigZagOrder_103 solution = new ZigZagOrder_103();

        // Calling the method and printing the result
        List<List<Integer>> zigzagOrder = solution.zigzagLevelOrder(root);
        System.out.println("Zigzag Level Order Traversal: " + zigzagOrder);
    }
}

