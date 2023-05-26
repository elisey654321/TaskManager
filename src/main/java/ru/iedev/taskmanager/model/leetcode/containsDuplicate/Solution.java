package ru.iedev.taskmanager.model.leetcode.containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Integer number = nums[i];
            if (set.contains(number)) return true;
            set.add(number);
        }
        System.gc();
        return false;
    }

}
