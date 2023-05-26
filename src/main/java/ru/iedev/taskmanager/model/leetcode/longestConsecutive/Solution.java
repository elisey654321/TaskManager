package ru.iedev.taskmanager.model.leetcode.longestConsecutive;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;

        Arrays.sort(nums);
        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) integerSet.add(nums[i]);

        final int[] result = {1};
        final int[] result1 = {1};
        final int[] lastNumber = {Integer.MAX_VALUE};

        integerSet.stream().sorted().forEach(number ->
            {
                if (number - lastNumber[0] == 1) result1[0]++;
                else result1[0] = 1;
                if (result1[0] > result[0]) result[0] = result1[0];
                lastNumber[0] = number;
            }
        );

        return result[0];
    }
}
