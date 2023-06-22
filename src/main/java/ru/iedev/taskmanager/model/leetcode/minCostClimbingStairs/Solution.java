package ru.iedev.taskmanager.model.leetcode.minCostClimbingStairs;

import java.util.*;

public class Solution {

    class Node{
        Integer val;
        Node left;
        Node right;

        public Node(Integer val) {
            this.val = val;
        }
    }

    private final TreeSet<Integer> result = new TreeSet<>();
    private final Queue<Integer> queue = new LinkedList();

    public int test_minCostClimbingStairs(int[] cost) {
        for (int i = 0; i < cost.length; i++) {
            queue.add(cost[i]);
        }
        Node root = new Node(0);
        helper(queue,root);

        return result.first();
    }

    private void helper(Queue<Integer> nowQueue, Node root){
        if (nowQueue.peek() == null) {
            result.add(root.val);
            return;
        }

        LinkedList<Integer> tempQueue = new LinkedList<>(nowQueue);

        Node nodeLeft = new Node(root.val + tempQueue.peek());
        root.left = nodeLeft;
        tempQueue.pollFirst();
        helper(tempQueue, root.left);

        if (tempQueue.peek() == null){
            result.add(root.val);
            return;
        }
        Node nodeRight = new Node(root.val + tempQueue.peek());
        root.right = nodeRight;
        tempQueue.pollFirst();
        helper(tempQueue, root.right);

    }

    public int minCostClimbingStairs(int[] cost) {
        int[] res = new int[cost.length + 1];
        res[cost.length] = 0;
        res[cost.length - 1] = cost[cost.length - 1];

        for (int i = cost.length - 2; i >= 0; i--) {
            res[i] =
                    (res[i + 1] < res[i + 2])
                            ? res[i + 1] + cost[i]
                            : res[i + 2] + cost[i];
        }

        return Math.min(res[0], res[1]);
    }


}
