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
