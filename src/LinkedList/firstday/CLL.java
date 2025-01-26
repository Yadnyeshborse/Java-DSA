package LinkedList.firstday;

public class CLL {


    private Node head;
    private Node tail;


    public CLL() {
        this.head = null;
        this.tail = null;
    }
    public void insert(int value){
        Node node=new Node(value);
        if (head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void display(){
        Node node=head;
        if (head!=null){
            do{
                System.out.print(node.val+" ->");
                node=node.next;
            }while (node!=head);
        }
    }


    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }

    public boolean hasCycle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next; // Move fast pointer two steps
            slow = slow.next;      // Move slow pointer one step
            if (fast == slow) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle found
    }

    //https://leetcode.com/problems/linked-list-cycle/description/
    public int findCycleLength() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next; // Move fast pointer two steps
            slow = slow.next;      // Move slow pointer one step
            if (fast == slow) {
                Node temp=slow;
                int length=0;
                do {
                    temp=temp.next;
                    length++;
                }while (temp!=slow);
                return length;

            }
        }
        return 0;
    }

    //https://leetcode.com/problems/linked-list-cycle-ii/
    //leecode futher problem

    //_______________________________Different Problem___________________

    //https://leetcode.com/problems/happy-number/description/
    public boolean happyNumber(int n){
        int slow=n;
        int fast=n;
        do {
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while (fast!=slow);

        //cau use fast==1 also
        if (slow==1){
            return true;
        }
        return false;

    }

    public int findSquare(int n){
        int num=0;
        int rem=0;
        while (n>0){
            rem=n%10;
            num+=rem*rem;
            n/=10;

        }
        return num;
    }

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //https://leetcode.com/problems/middle-of-the-linked-list/description/
    //https://leetcode.com/problems/middle-of-the-linked-list/

    public Node middle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // Slow pointer will now point to the middle
    }




    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
