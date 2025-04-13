package Trees.Questions.DFS.Questions;

public class FlatterBinarryTreeLinkedList_114 {

    // TreeNodeO class definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    // Function to flatten the binary tree
    public void flatten(TreeNode root) {
        TreeNode current = root;

        while (current != null) {
            if (current.left != null) {
                TreeNode temp = current.left;

                // Go to the rightmost node of the left subtree
                while (temp.right != null) {
                    temp = temp.right;
                }

                // Attach original right subtree
                temp.right = current.right;

                // Move left subtree to right
                current.right = current.left;
                current.left = null;
            }

            // Move to the next right node
            current = current.right;
        }
    }

    // Helper method to print the right-skewed tree (flattened list)
    public void printFlattened(TreeNode root) {
        while (root != null) {
            System.out.print(root.val + " -> ");
            root = root.right;
        }
        System.out.println("null");
    }

    // Sample tree and test
    public static void main(String[] args) {
        FlatterBinarryTreeLinkedList_114 obj = new FlatterBinarryTreeLinkedList_114();

        // Constructing sample tree: [1,2,5,3,4,null,6]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        obj.flatten(root); // flattening the tree
        obj.printFlattened(root); // expected: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
    }
}

