package Trees.Questions.BFS.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNodeNew {  // Custom TreeNodeRight class
    int val;
    TreeNodeRight left, right;

    TreeNodeNew(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
//https://leetcode.com/problems/binary-tree-level-order-traversal/description/
class Solution {
    public List<List<Integer>> levelOrder(TreeNodeRight root) {
        if (root == null) {
            return new ArrayList<>(); // Return an empty list instead of null
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNodeRight> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>(size);

            for (int i = 0; i < size; i++) {
                TreeNodeRight currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}

public class Question1_part_102 {
    public static void main(String[] args) {
        // Create a sample tree:
        TreeNodeRight root = new TreeNodeRight(1);
        root.left = new TreeNodeRight(2);
        root.right = new TreeNodeRight(3);
        root.left.left = new TreeNodeRight(4);
        root.left.right = new TreeNodeRight(5);
        root.right.right = new TreeNodeRight(6);

        Solution solution = new Solution();
        List<List<Integer>> result = solution.levelOrder(root);

        System.out.println(result);  // Expected output: [[1], [2, 3], [4, 5, 6]]
    }
}
