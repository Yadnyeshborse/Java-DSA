package Trees.AVL_Tree;


public class AVL_TREE {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int value) {
            this.value = value;
        }
    }
    public Node root;

    public AVL_TREE() {
    }

    public int height() {
        return height(root);
    }

    public int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void insert(int value){
        root=insert(value,root);
    }

    private Node insert(int value,Node node){
        if (node==null){
            node=new Node(value);
            return node;
        }

        if (value<node.value){
            node.left=insert(value,node.left);
        } else if (value>node.value) {
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return rotate(node);
    }

    private Node rotate(Node node){
        if (height(node.left)-height(node.right)>1){
            //left heavy
            if (height(node.left.left)-height(node.left.right)>0){
                //left left case 1
                return rightRotate(node);
            }
            if (height(node.left.left)-height(node.left.right)<0){
                //left right case 2
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (height(node.left)-height(node.right)<-1){
            //right heavy
            if (height(node.right.left)-height(node.right.right)<0){
                //right right case 3
                return leftRotate(node);
            }
            if (height(node.right.left)-height(node.right.right)>0){
                //right left case 4
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }


    private Node rightRotate(Node p) {
        Node c=p.left;
        Node t=c.right;

         c.right=p;
         p.left=t;

         p.height=Math.max(height(p.left),height(p.right))+1;
         c.height=Math.max(height(c.left),height(c.right))+1;
         return c;
    }


    private Node leftRotate(Node c) {
        Node p=c.right;
        Node t=p.left;

        p.left=c;
        c.right=t;
        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;
        return p;
    }

    public void populateSorted(int[] nums) {
        populateSorted(0, nums.length - 1, nums);  // Recursively insert elements from 0 to n-1
    }

    private void populateSorted(int start, int end, int[] nums) {
        if (start > end) {
            return;
        }

        int mid = start + (end - start) / 2; // Avoids integer overflow
        insert(nums[mid]); // Insert the middle element

        populateSorted(start, mid - 1, nums); // Left half
        populateSorted(mid + 1, end, nums);   // Right half
    }




//    public boolean isBalanced(){
//        return isBalanced(root);
//    }
//    private boolean isBalanced(Node node) {
//        if (node == null) {
//            return true; // Null nodes are balanced
//        }
//
//        int heightDiff = Math.abs(height(node.left) - height(node.right));
//
//        return heightDiff <= 1 && isBalanced(node.left) && isBalanced(node.right);
//    }

    public boolean isBalanced() {
        return isBalanced(root) != -1;
    }

    private int isBalanced(Node node) {
        if (node == null) {
            return 0;  // Null nodes are balanced with height 0
        }

        // Check the left subtree balance and height
        int leftHeight = isBalanced(node.left);
        if (leftHeight == -1) return -1;  // If the left subtree is unbalanced, propagate -1

        // Check the right subtree balance and height
        int rightHeight = isBalanced(node.right);
        if (rightHeight == -1) return -1;  // If the right subtree is unbalanced, propagate -1

        // Check if the current node is balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;  // If the height difference is greater than 1, the tree is unbalanced
        }

        // Return the height of the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }



    public void display(){
        display(this.root,"Root Details");
    }
    public void display(Node node, String details) {
        if (node == null) {
            return;
        }

        System.out.println(details + ": " + node.value);

        display(node.left, "Left of " + node.value);
        display(node.right, "Right of " + node.value);
    }

    //preety display

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {  // Use `Node` instead of `BinaryTrees.Node`
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);  // Recursion on right child

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);  // Display node value with indentation
        } else {
            System.out.println(node.value);  // Root node at the top
        }
        prettyDisplay(node.left, level + 1);  // Recursion on left child
    }




}
