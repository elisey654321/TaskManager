package ru.iedev.taskmanager.model.leetcode.mergeTwoLists;

import ru.iedev.taskmanager.model.leetcode.reverseList.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        ListNode result = new ListNode();
        ListNode dynamicResult = result;
        while (list1 != null || list2 != null) {
            if (list2 == null) {
                dynamicResult.val = list1.val;
                list1 = list1.next;
            } else if (list1 == null) {
                dynamicResult.val = list2.val;
                list2 = list2.next;
            } else if (list1.val < list2.val) {
                dynamicResult.val = list1.val;
                list1 = list1.next;
            } else {
                dynamicResult.val = list2.val;
                list2 = list2.next;
            }
            if (list1 != null || list2 != null) {
                dynamicResult.next = new ListNode();
                dynamicResult = dynamicResult.next;
            }
        }
        return result;
    }
}
