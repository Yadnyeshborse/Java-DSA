package Trees.BinaryTrees.BinryTreeBasic;

public class BinarySETPractise3 {
    public static class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;

    public BinarySETPractise3(){
        root=null;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void populate(int[] nums){
        for (int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    private void insert(int value) {
        root=insert(value,root);
    }
    public int height(Node node){
        if (node==null){
            return -1;
        }
        return node.height;
    }

    private Node insert(int value, Node node) {
        if (node==null){
            node=new Node(value);
            return node;
        }
        if (value<node.value){
            node.left=insert(value,node.left);
        }else if (value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    public void display(){
        display(this.root,"Root value");
    }

    private void display(Node node, String details) {
        if (node==null){
            return ;
        }
        System.out.println(details + node.value); // Print the current node's value
        display(node.left, "Left child of " + node.value + " : "); // Recur for the left child
        display(node.right, "Right child of " + node.value + " : "); // Recur for the right child

    }
    public boolean isBalanced(){
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node==null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && isBalanced(node.left) // Recur for the left subtree
                && isBalanced(node.right);
    }


    public static void main(String[] args) {
        int nums[]={5,2,7,1,4,6,9,8,10};
        BinarySETPractise3 practise3=new BinarySETPractise3();
        practise3.populate(nums);
        practise3.display();
        System.out.println("Is the tree balanced? " + practise3.isBalanced());

    }
}
