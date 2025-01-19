package LinkedList;

import LinkedList.firstday.LL;

public class InterviewQuestions {

    private ListNode head;
    private ListNode tail;
    private int size; // Added size variable to track the number of elements

    public InterviewQuestions() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Inserts a new node with value 'val' at the head of the list
    public void insertAtHead(int val) {
        ListNode node = new ListNode(val); // Create a new node
        node.next = head;                  // Point the new node to the current head
        head = node;                       // Update head to the new node
        if (tail == null) {                // If the list was empty, update tail
            tail = head;
        }
        size++;                            // Increment the size
    }

    // Prints the linked list
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Returns the size of the linked list
    public int getSize() {
        return size;
    }

    //reverse by iteration
    public void reverseByIteration() {
        if (size < 2) {
            return; // No need to reverse if the list has 0 or 1 element
        }

        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = previous; // Reverse the link
            previous = present;      // Move previous to the current node
            present = next;          // Move present to the next node
            if (next != null) {
                next = next.next; // Move next to the next node in the list
            }
        }

        // Update head and tail pointers
        tail = head;
        head = previous;
    }

    //reverse in two poinst 1 2 3 4 5 result 1 2 3 2 5
    // Reverse a portion of the linked list between two positions
    //https://leetcode.com/problems/reverse-linked-list-ii/description/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head; // No need to reverse if left == right
        }

        // Skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        // `prev` now points to the node before `left`
        // `current` now points to the `left` node
        ListNode last = prev;
        ListNode newEnd = current;

        // Reverse nodes between `left` and `right`
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev; // Connect the `left-1` node to the reversed portion
        } else {
            head = prev; // Update head if reversing starts at position 1
        }

        newEnd.next = current; // Connect the reversed portion to the rest of the list
        return head;
    }
//_________________________________________________________________________________________________
    //Palindrome Linked List
    //https://leetcode.com/problems/palindrome-linked-list/description/


    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode mid=middleNode(head);
            ListNode headSecond=reverseList(mid);
            ListNode reversehead=headSecond;

            while(head!=null && headSecond!=null){
                if(head.val!=headSecond.val){
                    reverseList(reversehead); // Restore the original list before returning
                    return false;
                }
                head=head.next;
                headSecond=headSecond.next;

            }
            reverseList(reversehead);
            return true;

        }

        public ListNode middleNode(ListNode head) {
            ListNode s = head;
            ListNode f = head;

            while (f != null && f.next != null) {
                s = s.next;
                f = f.next.next;
            }
            return s;
        }
        public ListNode reverseList(ListNode head) {
            if (head == null) {
                return head;
            }
            ListNode prev = null;
            ListNode present = head;
            ListNode next = present.next;

            while (present != null) {
                present.next = prev;
                prev = present;
                present = next;
                if (next != null) {
                    next = next.next;
                }
            }
            return prev;
        }

    }

    //____________________________________________________________________________________________
    //https://leetcode.com/problems/reorder-list/description/
    class Solution {
        public void reorderList(ListNode head) {
            if(head==null||head.next==null){
                return;
            }
            ListNode mid=middleNode(head);

            ListNode headSecond=reverseList(mid);
            ListNode headFirst=head;

            while (headFirst != null && headSecond != null) {
                ListNode temp = headFirst.next;
                headFirst.next = headSecond;
                headFirst = temp;

                temp = headSecond.next;
                headSecond.next = headFirst;
                headSecond = temp;
            }

            if (headFirst != null) {
                headFirst.next = null;
            }

        }

        public ListNode middleNode(ListNode head) {
            ListNode s = head;
            ListNode f = head;

            while (f != null && f.next != null) {
                s = s.next;
                f = f.next.next;
            }
            return s;
        }
        public ListNode reverseList(ListNode head) {
            if (head == null) {
                return head;
            }
            ListNode prev = null;
            ListNode present = head;
            ListNode next = present.next;

            while (present != null) {
                present.next = prev;
                prev = present;
                present = next;
                if (next != null) {
                    next = next.next;
                }
            }
            return prev;
        }
    }

    //__________________________________________________________________________________

    //https://leetcode.com/problems/reverse-nodes-in-k-group/
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        int length = getLength(head);
        int count = length / k;
        while (count > 0) {
            ListNode last = prev;
            ListNode newEnd = current;

            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            prev = newEnd;
            count--;
        }
        return head;

    }
    public int getLength(ListNode head) {
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    //__________________________________________________________________________________________________

    // https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
    public ListNode reverseAlternateKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode last = prev;
            ListNode newEnd = current;

            // reverse between left and right
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            // skip the k nodes
            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    //_____________________________________________________________________________________________



    public static void main(String[] args) {
        InterviewQuestions list = new InterviewQuestions();

        // Insert elements
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);

        // Display the list
        list.display();

        // Print the size of the list
        System.out.println("Size: " + list.getSize());

        System.out.println("Reversed By Iteration");
        list.reverseByIteration();
        list.display();
        System.out.println("Reversed betweeb two points");
        list.reverseBetween(list.head,20,40);
    }
}

class ListNode {
    int val;
    ListNode next;
    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }



    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
        next = null;
    }
}
