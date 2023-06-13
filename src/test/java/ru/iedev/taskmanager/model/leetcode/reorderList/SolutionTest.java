package ru.iedev.taskmanager.model.leetcode.reorderList;

import org.junit.jupiter.api.Test;
import ru.iedev.taskmanager.model.leetcode.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reorderList() {

        ListNode lN = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
        ListNode lNResult = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
        new Solution().reorderList(lN);
        assertEquals(lNResult,lN);

    }

    @Test
    void reorderList1() {

        ListNode lN = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode lNResult = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
        new Solution().reorderList(lN);
        assertEquals(lNResult,lN);

    }
}