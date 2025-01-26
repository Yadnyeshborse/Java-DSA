package LinkedList.Questions;


//not complete solution
//https://leetcode.com/problems/sort-list/description/

public class Mergesort {

    public ListNode sortList(ListNode head) {
        // Base case: If the list has 0 or 1 node, it is already sorted
        if (head == null || head.next == null) {
            return head;
        }

        // Split the list into two halves
        ListNode mid = getMid(head);

        // Recursively sort the left and right halves
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        // Merge the sorted halves
        return merge(left, right);
    }

    // Merges two sorted linked lists and returns the head of the merged list
    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(); // Dummy node to simplify edge cases
        ListNode tail = dummyHead;

        // Merge the two lists by comparing node values
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next; // Move the tail forward
        }

        // Append the remaining nodes of the non-empty list
        tail.next = (list1 != null) ? list1 : list2;

        return dummyHead.next; // Return the merged list starting from the first real node
    }

    // Splits the list into two halves and returns the head of the second half
    ListNode getMid(ListNode head) {
        ListNode midPrev = null;

        // Use two-pointer technique to find the middle of the list
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }

        // Handle single-element list case
        if (midPrev == null) {
            return head;
        }

        ListNode mid = midPrev.next; // Midpoint of the list
        midPrev.next = null;        // Break the list into two halves
        return mid;
    }
}

// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
