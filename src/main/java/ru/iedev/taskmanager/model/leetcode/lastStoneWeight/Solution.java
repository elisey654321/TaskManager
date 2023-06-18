package ru.iedev.taskmanager.model.leetcode.lastStoneWeight;

import java.util.Arrays;

public class Solution {
    public int lastStoneWeight(int[] stones) {

        while (stones.length > 1){
            Arrays.sort(stones);
            stones = arrayConverts(stones);
        }

        return (stones.length == 1?stones[0]:0);
    }

    private int[] arrayConverts(int[] stones){

        int[] stonesNew;

        int result = stones[stones.length - 1] - stones[stones.length - 2];

        if (result == 0) {
            stonesNew = new int[stones.length-2];
        }else {
            stonesNew = new int[stones.length-1];
            stonesNew[stonesNew.length - 1] = result;
        }

        for (int i = 0; i < stonesNew.length; i++) {
            if (stonesNew[i] == 0) {
                stonesNew[i] = stones[i];
            }
        }

        return stonesNew;

    }
}
