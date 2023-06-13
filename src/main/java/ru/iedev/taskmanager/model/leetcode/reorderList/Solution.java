package ru.iedev.taskmanager.model.leetcode.reorderList;

import ru.iedev.taskmanager.model.leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void reorderList(ListNode head) {
        List<ListNode> listNodeList = new ArrayList<>();

        while (head != null){
            listNodeList.add(head);
            head = head.next;
        }
        int size = listNodeList.size();
        int length = size/2;
        head = listNodeList.get(0);
        ListNode nowNode = head;
        ListNode lastNode = head;
        for (int i = 1; i <= length; i++) {
            nowNode.next = listNodeList.get(size - i);
            nowNode.next.next = listNodeList.get(i);
            lastNode = nowNode.next;
            nowNode = nowNode.next.next;
        }
//        lastNode.next = null;
        nowNode.next = null;

        return;
    }
}
