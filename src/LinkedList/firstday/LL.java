package LinkedList.firstday;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size=0;
    }


    //assuming empty list starting from 0
    public void insertNext(int val){
        Node node=new Node(val);                        // need new node for insting element
        node.next=head;
        head=node;                              //head always points to first element
        if (tail==null){
            tail=head;
        }
        size+=1;
    }
    public void inserLast(int val){
        if (tail==null){    //if nothing is their i.r empty list
            insertNext(val);
            return;
        }
        Node node=new Node(val);    //we need an empty node for inserting than we will assign value of reference node and than wil make that node as reference
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int val,int index){
        if (index==0){                     // Case 1: Insert at the beginning
            insertNext(val);
            return;
        }
        if (index==size){                     // Case 2: Insert at the end
            inserLast(val);
            return;
        }
        Node temp=head;      //initialize list
        for (int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(temp.next, val); // Create a new node pointing to the next node
        temp.next = node;             // Update the previous node to point to the new node
        size++;

    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }
    //delete last
    public int deleteLast() {
        if (size <= 1) {                 // If there's 1 or no elements
            return deleteFirst();        // Delegate to deleteFirst
        }
        Node secondLast = get(size - 2); // Get the second-to-last node
        int value = tail.value;          // Store the value of the current tail
        tail = secondLast;               // Update the tail to the second-to-last node
        tail.next = null;                // Remove the reference to the old tail
        return value;                    // Return the value of the deleted node
    }

    //delete at particular index
    public int delete(int index){
        if (index==0){
            return  deleteFirst();
        }
        if (index==size-1){
            return deleteLast();
        }
        Node pre = get(index - 1);        // Get the node just before the one to delete
        int val = pre.next.value;         // Store the value of the node to delete     //just in case if we want to returen deleted value we aused this
        pre.next = pre.next.next;         // Bypass the node to be deleted
        size--;                           // Decrease the size of the linked list
        return val;                       // Return the deleted node's value
    }

    public Node get(int index) {
        Node node = head;                // Start from the head
        for (int i = 0; i < index; i++) { // Traverse the list up to the specified index
            node = node.next;
        }
        return node;                     // Return the node at the specified index
    }

    //find location of particular node
    public Node find(int value){
        Node node=head;
        while (node!=null){
            if (node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    //inserat first
    public void first(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        size+=1;
    }

    public void display(){
        Node temp=head;    //we can not do Sysout(head.next) as at last position it will be null
        while (temp!= null){    //we can not change structure of list as head.next will go on pointing next element
            System.out.print(temp.value+"--->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    //__________________________________________________________________________________________________

    // insert using recursion
    // Public method to insert a value at a specific index using recursion
    public void insertRec(int value, int index) {
        head = insertRec(value, index, head); // Start recursion with the head of the list
    }

    // Private recursive method to handle the insertion
    private Node insertRec(int value, int index, Node node) {
        // Base case: If the index is 0, insert the new node here
        if (index == 0) {
            Node temp = new Node(node, value); // Create a new node with the given value and next pointing to the current node
            size++; // Increment the size of the list
            return temp; // Return the new node, which becomes the new head (or part of the chain)
        }

        // Recursive case: Move to the next node, reducing the index by 1
        node.next = insertRec(value, index - 1, node.next);

        // Return the current node to maintain the chain
        return node;
    }


    private class Node{
        private int value;
        private Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }


        public Node(int value) {
            this.value = value;
        }
        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }
}
