// LeetCode 206: Reverse Linked List
public class ReverseLinkedList {

    // Iterative Approach
    public ListNode reverseListIterative(ListNode head) {
        ListNode prev = null;
        ListNode present = head;
        ListNode next = (present != null) ? present.next : null;

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

    // Recursive Approach
    public ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
