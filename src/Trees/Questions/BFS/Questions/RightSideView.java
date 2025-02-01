package Trees.Questions.BFS.Questions;

import java.util.*;

class TreeNodeRight {
    int val;
    TreeNodeRight left, right;

    TreeNodeRight(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
//https://www.geeksforgeeks.org/level-order-successor-of-a-node-in-binary-tree/
public class RightSideView {

    // Method to get the right side view of the binary tree
    public List<Integer> rightSideView(TreeNodeRight root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result; // Return an empty list if the tree is empty
        }

        Queue<TreeNodeRight> queue = new LinkedList<>();
        queue.offer(root); // Start BFS with the root node

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNodeRight currentNode = queue.poll(); // Remove node from queue

                // If it's the last node in the current level, add it to the result
                if (i == levelSize - 1) {
                    result.add(currentNode.val);
                }

                // Add left child to queue if it exists
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                // Add right child to queue if it exists
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNodeRight root = new TreeNodeRight(1);
        root.left = new TreeNodeRight(2);
        root.right = new TreeNodeRight(3);
        root.left.right = new TreeNodeRight(5);
        root.right.right = new TreeNodeRight(4);

        // Creating an instance of the RightSideView class
        RightSideView solution = new RightSideView();

        // Getting the right-side view of the tree
        List<Integer> rightView = solution.rightSideView(root);

        // Printing the result
        System.out.println("Right Side View of the Tree: " + rightView);
    }
}
