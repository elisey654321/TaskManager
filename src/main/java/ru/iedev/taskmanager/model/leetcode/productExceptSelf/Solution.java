package ru.iedev.taskmanager.model.leetcode.productExceptSelf;

import java.util.HashMap;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        HashMap<Integer,Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if (result.get(number) == null) {
                int productNumbers = 1;
                for (int j = 0; j < nums.length; j++) {
                    if (j != i){
                        productNumbers *= nums[j];
                    }
                }
                result.put(number,productNumbers);
            }
            answer[i] = result.get(number);
        }
        return answer;
    }

}
