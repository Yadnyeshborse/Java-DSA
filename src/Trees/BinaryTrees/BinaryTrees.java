package Trees.BinaryTrees;

import java.util.Scanner;

public class BinaryTrees {
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Insert elements into the tree
    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        // Left child
        System.out.println("Do you want to enter value at left of " + node.value + "? (true/false)");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the left value:");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        // Right child
        System.out.println("Do you want to enter value at right of " + node.value + "? (true/false)");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the right value:");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    // Display the tree
    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }

    // Pre-Order Traversal (Root -> Left -> Right)
    public void preOrder(){
        preOrder(root);
        System.out.println(); // Print new line for clarity
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // In-Order Traversal (Left -> Root -> Right)
    public void inOrder(){
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // Post-Order Traversal (Left -> Right -> Root)
    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTrees tree = new BinaryTrees();
        tree.populate(scanner);

        System.out.println("Tree Display:");
        tree.prettyDisplay();

        System.out.println("\nPre-Order Traversal:");
        tree.preOrder();

        System.out.println("In-Order Traversal:");
        tree.inOrder();

        System.out.println("Post-Order Traversal:");
        tree.postOrder();
    }
}
