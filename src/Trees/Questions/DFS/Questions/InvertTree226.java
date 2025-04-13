package Trees.Questions.DFS.Questions;

class TreeNode {
    int val;
    TreeNodeO left;
    TreeNodeO right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNodeO left, TreeNodeO right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class InvertTree226 {

    public TreeNodeO invertTree(TreeNodeO root) {
        if (root == null) return null;

        TreeNodeO left = invertTree(root.left);
        TreeNodeO right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public void printInOrder(TreeNodeO node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        InvertTree226 sol = new InvertTree226();

        // Original Tree:
        //       4
        //     /   \
        //    2     7
        //   / \   / \
        //  1   3 6   9

        TreeNodeO root = new TreeNodeO(4,
                new TreeNodeO(2, new TreeNodeO(1), new TreeNodeO(3)),
                new TreeNodeO(7, new TreeNodeO(6), new TreeNodeO(9))
        );

        System.out.print("Original In-order: ");
        sol.printInOrder(root); // 1 2 3 4 6 7 9

        sol.invertTree(root);

        System.out.print("\nInverted In-order: ");
        sol.printInOrder(root); // 9 7 6 4 3 2 1
    }
}

