import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Question_average_part2_637 {
    static class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            if (root == null) {
                return new ArrayList<>(); // Return an empty list instead of null
            }

            List<Double> result = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                int size = queue.size();
                double sum = 0;

                for (int i = 0; i < size; i++) {
                    TreeNode currentNode = queue.poll();
                    sum += currentNode.val;

                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
                result.add(sum / size);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Calling the function
        Solution sol = new Solution();
        List<Double> averages = sol.averageOfLevels(root);

        // Printing the result
        System.out.println("Average of each level: " + averages);
    }
}
