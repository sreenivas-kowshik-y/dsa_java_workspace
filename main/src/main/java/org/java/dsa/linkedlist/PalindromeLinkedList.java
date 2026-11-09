// LeetCode 234: Palindrome Linked List
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode mid = getMiddle(head);
        ListNode headSecond = reverseList(mid);
        ListNode reReverseHead = headSecond;

        // Compare first half and second half
        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        reverseList(reReverseHead); // Re-reverse to restore original structure
        return head == null || headSecond == null;
    }

    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;
        while (present != null) {
            ListNode next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }
        return prev;
    }
}
