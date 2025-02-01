package Trees.Questions.BFS.Questions;

import java.util.*;

class TreeNode_19 {
    int val;
    TreeNode_19 left;
    TreeNode_19 right;

    TreeNode_19() {}
    TreeNode_19(int val) { this.val = val; }
    TreeNode_19(int val, TreeNode_19 left, TreeNode_19 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Binary_Tree_Right_Side_View_199 {
    public List<Integer> rightSideView(TreeNode_19 root) {
        if (root == null) {
            return new ArrayList<>(); // ✅ Return empty list if tree is empty
        }

        List<Integer> result = new ArrayList<>();
        Queue<TreeNode_19> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode_19 currentNode = queue.poll();
                if (i == size - 1) { // ✅ Add the last node of each level
                    result.add(currentNode.val);
                }
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        Binary_Tree_Right_Side_View_199 solution = new Binary_Tree_Right_Side_View_199();

        // Creating test case: [1,2,3,null,5,null,4]
        TreeNode_19 root = new TreeNode_19(1);
        root.left = new TreeNode_19(2);
        root.right = new TreeNode_19(3);
        root.left.right = new TreeNode_19(5);
        root.right.right = new TreeNode_19(4);

        // Expected Output: [1, 3, 4]
        System.out.println("Right side view: " + solution.rightSideView(root));
    }
}
