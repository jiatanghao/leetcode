package 链表;

public class 递归反转链表_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode newHead = reverseList(head.next);
        head.next = null;
        next.next = head;
        return newHead;
    }
}
