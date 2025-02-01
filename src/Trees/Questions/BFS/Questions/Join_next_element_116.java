package Trees.Questions.BFS.Questions;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
public class Join_next_element_116 {
    public static Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Node leftMost = root;
        while (leftMost.left != null) {
            Node current = leftMost;
            while (current != null) {
                current.left.next = current.right;
                if (current.next != null) {
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }

    // Helper method to print the next pointers of each level
    public static void printNextPointers(Node root) {
        Node levelStart = root;
        while (levelStart != null) {
            Node current = levelStart;
            while (current != null) {
                System.out.print(current.val + " -> ");
                if (current.next != null) {
                    System.out.print(current.next.val + " ");
                } else {
                    System.out.print("NULL ");
                }
                current = current.next;
            }
            System.out.println();
            levelStart = levelStart.left;
        }
    }

    public static void main(String[] args) {
        // Creating a perfect binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Connect nodes at the same level
        connect(root);

        // Print the next pointers of each level
        System.out.println("Next pointers of each level:");
        printNextPointers(root);
    }
}
