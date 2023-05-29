package ru.iedev.taskmanager.model.leetcode.hasCycle;

import ru.iedev.taskmanager.model.leetcode.reverseList.ListNode;

import java.util.HashSet;

public class Solution {
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> listNodes = new HashSet<>();
        while (head != null){
            if (listNodes.contains(head)){
                return true;
            }else listNodes.add(head);
            head = head.next;
        }
        return false;

    }
}
