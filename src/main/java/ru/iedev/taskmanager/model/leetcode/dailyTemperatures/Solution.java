package ru.iedev.taskmanager.model.leetcode.dailyTemperatures;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        int indexMaxValue = 0;
        int maxValue = 0;
        int lastValue = Integer.MAX_VALUE;
        int length = temperatures.length;
        for (int i = 0; i < length-1; i++) {
            boolean search = false;
            int val = temperatures[i];
            if (val < lastValue || val >= maxValue) {
                for (int j = i + 1; j < length; j++) {
                    if (temperatures[j] > val) {
                        indexMaxValue = j;
                        maxValue = temperatures[j];
                        search = true;
                        break;
                    }
                }
            }else
                search = true;
            if (search) {
                result[i] = (indexMaxValue - i<0?0:indexMaxValue - i);
            }
            lastValue = val;
        }

        return result;
    }
}
