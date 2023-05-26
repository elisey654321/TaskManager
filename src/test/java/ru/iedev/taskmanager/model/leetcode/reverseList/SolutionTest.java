package ru.iedev.taskmanager.model.leetcode.reverseList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseList() {
        ListNode result = new Solution().reverseList(new ListNode(1,new ListNode(2,new ListNode(3))));
        assertEquals(new ListNode(1,new ListNode(2,new ListNode(3))),result);
    }
}