package Trees.Questions.BFS.Questions;

class TreeNode {
    int val;
    TreeNode_101 left;
    TreeNode_101 right;

    TreeNode(int val) {
        this.val = val;
    }
}
//https://leetcode.com/problems/cousins-in-binary-tree/description/
public class CousionBinaryTree_993 {
    public boolean isCousins(TreeNode_101 root, int x, int y) {
        TreeNode_101 xx = findNode(root, x);
        TreeNode_101 yy = findNode(root, y);

        return (!issibling(root, xx, yy) && (level(root, xx, 0) == level(root, yy, 0)));
    }

    TreeNode_101 findNode(TreeNode_101 root, int x) {
        if (root == null) {
            return null;
        }
        if (root.val == x) {
            return root;
        }
        TreeNode_101 n = findNode(root.left, x);
        if (n != null) {
            return n;
        }
        return findNode(root.right, x);
    }

    int level(TreeNode_101 node, TreeNode_101 xx, int lev) {
        if (node == null) {
            return -1;
        }
        if (node == xx) {
            return lev;
        }
        int l = level(node.left, xx, lev + 1);
        if (l != -1) {
            return l;
        }
        return level(node.right, xx, lev + 1);
    }

    boolean issibling(TreeNode_101 node, TreeNode_101 x, TreeNode_101 y) {
        if (node == null) {
            return false;
        }
        return (node.left == x && node.right == y) ||
                (node.right == x && node.left == y) ||
                issibling(node.left, x, y) ||
                issibling(node.right, x, y);
    }

    // Main Method to Test the Functionality
    public static void main(String[] args) {
        CousionBinaryTree_993 tree = new CousionBinaryTree_993();

        // Creating a sample tree:
        //        1
        //       / \
        //      2   3
        //     /     \
        //    4       5
        TreeNode_101 root = new TreeNode_101(1);
        root.left = new TreeNode_101(2);
        root.right = new TreeNode_101(3);
        root.left.left = new TreeNode_101(4);
        root.right.right = new TreeNode_101(5);

        int x = 4, y = 5;
        boolean result = tree.isCousins(root, x, y);
        System.out.println("Are " + x + " and " + y + " cousins? " + result);
    }
}
