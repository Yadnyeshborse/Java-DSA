package Trees.BinaryTrees;

public class BinarySearchTree {
    // Node class representing a single node in the tree
    public class Node {
        private int value;    // Value of the node
        private int height;   // Height of the node
        private Node left;    // Left child of the node
        private Node right;   // Right child of the node

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root; // Root node of the BST

    // Constructor for the BinarySearchTree class
    public BinarySearchTree() {
        root = null;
    }

    // Method to get the height of a node
    public int height(Node node) {
        if (node == null) {
            return -1; // Null nodes have a height of -1
        }
        return node.height;
    }

    // Method to check if the tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Public method to insert a value into the tree
    public void insert(int value) {
        root = insert(value, root);
    }

    // Private recursive method to insert a value into the tree
    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value); // Create a new node if the current node is null
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left); // Recur for the left subtree
        } else if (value > node.value) {
            node.right = insert(value, node.right); // Recur for the right subtree
        }

        // Update the height of the current node
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node; // Return the updated node
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length);
    }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }

    // Method to check if the tree is balanced
    public boolean isBalanced() {
        return isBalanced(root);
    }

    // Private recursive method to check if a subtree is balanced
    private boolean isBalanced(Node node) {
        if (node == null) {
            return true; // A null node is considered balanced
        }

        // Check if the height difference between left and right subtrees is <= 1
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && isBalanced(node.left) // Recur for the left subtree
                && isBalanced(node.right); // Recur for the right subtree
    }

    // Method to display the tree in a readable format
    public void display() {
        display(this.root, "Root Node: ");
    }

    // Private recursive method to display the tree
    private void display(Node node, String details) {
        if (node == null) {
            return; // Base case: nothing to display for null nodes
        }

        System.out.println(details + node.value); // Print the current node's value
        display(node.left, "Left child of " + node.value + " : "); // Recur for the left child
        display(node.right, "Right child of " + node.value + " : "); // Recur for the right child
    }

    // Method to pretty-print the tree
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        // Display the right subtree first
        prettyDisplay(node.right, level + 1);

        // Indentation for the current level
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }

        // Display the left subtree
        prettyDisplay(node.left, level + 1);
    }
}
