package ru.iedev.taskmanager.model.leetcode.kthLargest;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class KthLargest {

    private PriorityQueue<Integer> result = new PriorityQueue<Integer>();
    private final Integer k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int i = 0; i < nums.length; i++) add(nums[i]);
    }

    public int add(int val) {
        if (result.size() < k) result.add(val);
        else if (val > result.peek()){
            result.poll();
            result.add(val);
        }
        return result.peek();
    }

}
