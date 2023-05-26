package ru.iedev.taskmanager.model.leetcode.reverseList;

import java.util.LinkedList;

public class Solution {

    public ListNode reverseList(ListNode head) {
        LinkedList<ListNode> listNodes = new LinkedList<>();
        ListNode firstResult,result;
        while (head.next != null){
            listNodes.addFirst(head);
            head = head.next;
        }
        listNodes.addFirst(head);
        firstResult = listNodes.peekFirst();
        result = listNodes.pollFirst();
        head = result;
        while (true){
            result.next = head;
            result = result.next;
            if (listNodes.peekFirst() == null) {
                result.next = null;
                break;
            }
            head = listNodes.pollFirst();
        }
        return firstResult;
    }

}
