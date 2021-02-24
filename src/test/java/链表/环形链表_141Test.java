package 链表;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class 环形链表_141Test {

    @Test
    void hasCycle() {
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;
        Assertions.assertTrue(new 环形链表_141().hasCycle(head));
    }
}