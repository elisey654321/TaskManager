package ru.iedev.taskmanager.model.leetcode.twoSum2;

import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int lengthNums = nums.length;
        for (int i = 0; i < lengthNums; i++) {
            for (int j = i + 1; j < lengthNums; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    break;
                } else if (nums[i] + nums[j] > target) {
                    break;
                }
            }
            if (result[1] != 0) break;
        }
        return result;
    }

}
