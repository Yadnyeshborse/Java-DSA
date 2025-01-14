package LinkedList.firstday;

public class DLL {
    Node head;

    public void inserFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head=node;
    }

    //insert last
    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        //if their is no element
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }


    public void dispaly(){
        Node node=head;
        Node last=null;    //for reverse purpose
        while (node!=null){
            System.out.print(node.val+"------>");
            last = node;            //for reverse purpose
            node=node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last!=null){
            System.out.print(last.val+"---->");
            last=last.prev;
        }
        System.out.println("Start");

    }

    //find particular node
    public Node find(int value){
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node; // Found the node with the given value
            }
            node = node.next; // Traverse to the next node
        }
        return null; // Return null if no node with the given value exists
    }


    public void insert(int after, int value){
        Node p = find(after); // Find the node after which the new node will be inserted
        if (p == null) {
            System.out.println("Value Does not exist");
            return; // Exit if the node is not found
        }
        Node node = new Node(value); // Create the new node with the given value
        node.next = p.next;          // Link the new node's next to p's next
        p.next = node;               // Link p's next to the new node
        node.prev = p;               // Link the new node's prev to p
        if (node.next != null) {     // If p.next (original next) is not null
            node.next.prev = node;   // Update its prev to the new node
        }
    }




    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }


    }
}
