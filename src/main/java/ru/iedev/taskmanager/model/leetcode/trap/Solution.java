package ru.iedev.taskmanager.model.leetcode.trap;

import java.util.Arrays;

public class Solution {
    public int trap(int[] height) {
        int result = 0;
        int length = height.length;
        int maxLeft = 0;
        for (int i = 0; i < length; i++) {
            int value = height[i];
            maxLeft = Math.max(value,maxLeft);
            int maxRight = 0;
            for (int j = i+1; j < length; j++) {
                maxRight = Math.max(height[j],maxRight);
            }
            if (Math.min(maxLeft, maxRight) > value) {
                result += Math.min(maxLeft, maxRight) - value;
            }
        }
        return result;
    }
}
