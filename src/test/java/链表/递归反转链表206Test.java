package 链表;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class 递归反转链表206Test {

    @Test
    void reverseList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode listNode = new 递归反转链表_206().reverseList(head);
        Assertions.assertEquals(4, listNode.val);
        Assertions.assertEquals(3, listNode.next.val);
        Assertions.assertEquals(2, listNode.next.next.val);
        Assertions.assertEquals(1, listNode.next.next.next.val);
    }
}