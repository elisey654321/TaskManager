package ru.iedev.taskmanager.model.leetcode.mergeTwoLists;

import org.junit.jupiter.api.Test;
import ru.iedev.taskmanager.model.leetcode.reverseList.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mergeTwoLists() {
        ListNode arrayListNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode arrayListNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode result = new Solution().mergeTwoLists(arrayListNode1, arrayListNode2);
        System.out.println(result);
    }

    @Test
    void mergeTwoLists1() {
        ListNode arrayListNode1 = null;
        ListNode arrayListNode2 = null;

        ListNode result = new Solution().mergeTwoLists(arrayListNode1, arrayListNode2);
        System.out.println(result);
    }

    @Test
    void mergeTwoLists2() {
        ListNode arrayListNode1 = null;
        ListNode arrayListNode2 = new ListNode(0);

        ListNode result = new Solution().mergeTwoLists(arrayListNode1, arrayListNode2);
        System.out.println(result);
    }
}