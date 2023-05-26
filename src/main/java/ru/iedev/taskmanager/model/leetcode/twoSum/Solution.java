package ru.iedev.taskmanager.model.leetcode.twoSum;

import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int[] numsCopy = nums.clone();
        Arrays.sort(numsCopy);
        int symbolI = 0;
        int symbolj = 0;
        boolean find = false;
        int numsLength = numsCopy.length;

        for (int i = 0; i < numsLength; i++) {
            for (int j = 0; j < numsLength; j++) {
                if (i == j) continue;

                symbolI = numsCopy[i];
                symbolj = numsCopy[j];

                if (symbolI + symbolj == target){
                    find = true;
                    break;
                }

            }
            if (find){
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int symbol = nums[i];
            if (symbol == symbolI && result[0] == 0){
                result[0] = i;
            }else if (symbol == symbolj && result[1] == 0){
                result[1] = i;
            }
        }

        return result;

    }

}
