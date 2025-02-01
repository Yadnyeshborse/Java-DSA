package Trees.Segment_Tree;

public class Segment {
    private static class Node {
        Node left, right;
        int startInterval, endInterval;
        int data;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public Segment(int[] arr) {
        this.root = ConstructTree(arr, 0, arr.length - 1);
    }

    private Node ConstructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = this.ConstructTree(arr, start, mid);
        node.right = this.ConstructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        if (node == null) return;

        String str = "";

        if (node.left != null) {
            str += "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => ";
        } else {
            str += "No left child";
        }

        str += "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= ";

        if (node.right != null) {
            str += "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data;
        } else {
            str += "No right child";
        }

        System.out.println(str + '\n');

        display(node.left);
        display(node.right);
    }

    public int query(int qsi, int qei) {
        return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node == null) return 0;

        // Completely inside the query range
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        }

        // Completely outside the query range
        if (node.startInterval > qei || node.endInterval < qsi) {
            return 0;
        }

        // Partial overlap, check both left and right children
        return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
    }

    // update
    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }
    private int update(Node node, int index, int value) {
        if (index >= node.startInterval&& index <= node.endInterval){
            if(index == node.startInterval && index == node.endInterval) {
                node.data = value;
                return node.data;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}
