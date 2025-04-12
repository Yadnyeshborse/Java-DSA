package Trees.BinaryTrees.BinryTreeBasic;

import Trees.BinaryTrees.BinaryTrees;

import java.util.Scanner;

public class PractiseBinaryTree {
    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root value");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter value at left of " + node.value + "? (true/false)");
        boolean choice=scanner.nextBoolean();
        if (choice){
            System.out.println("Enter left value=");
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to enter value at right of " + node.value + "? (true/false)");
        choice=scanner.nextBoolean();
        if (choice){
            System.out.println("Enter the right value");
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);

        }
    }
    public void display() {
        display(root, "");
    }

    private void display(PractiseBinaryTree.Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PractiseBinaryTree tree=new PractiseBinaryTree();
        tree.populate(scanner);
        tree.display();
    }
}




