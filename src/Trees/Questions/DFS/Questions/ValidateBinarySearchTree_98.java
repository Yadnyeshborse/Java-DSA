package Trees.Questions.DFS.Questions;

// TreeNodeO.java
class TreeNodeO {
    int val;
    TreeNodeO left;
    TreeNodeO right;

    TreeNodeO() {}

    TreeNodeO(int val) {
        this.val = val;
    }

    TreeNodeO(int val, TreeNodeO left, TreeNodeO right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Solution.java
class Solution {
    public boolean isValidBST(TreeNodeO root) {
        return helper(root, null, null);
    }

    public boolean helper(TreeNodeO root, Integer low, Integer high) {
        if (root == null) return true;

        if (low != null && root.val <= low) {
            return false;
        }

        if (high != null && root.val >= high) {
            return false;
        }

        boolean leftNode = helper(root.left, low, root.val);
        boolean rightNode = helper(root.right, root.val, high);

        return leftNode && rightNode;
    }
}

// Main.java
public class ValidateBinarySearchTree_98 {
    public static void main(String[] args) {
        /*
            Tree structure:
                5
               / \
              3   7
        */
        TreeNodeO root = new TreeNodeO(5);
        root.left = new TreeNodeO(3);
        root.right = new TreeNodeO(7);

        Solution sol = new Solution();
        boolean result = sol.isValidBST(root);
        System.out.println("Is valid BST? " + result);
    }
}

