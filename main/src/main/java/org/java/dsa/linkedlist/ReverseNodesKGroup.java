// LeetCode 25: Reverse Nodes in k-Group
public class ReverseNodesKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) return head;

        ListNode current = head;
        ListNode prev = null;

        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        while (count >= k) {
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
            count -= k;
        }
        return head;
    }
}
