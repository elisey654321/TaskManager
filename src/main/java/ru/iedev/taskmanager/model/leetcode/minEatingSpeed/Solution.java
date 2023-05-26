package ru.iedev.taskmanager.model.leetcode.minEatingSpeed;

import java.util.Arrays;

public class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        Arrays.sort(piles);
        int start = 1;
        int end = piles[piles.length-1];
        int mind = 1;
        int result = 1;
        while (start <= end) {
            mind = start + (end - start) / 2;
            int nowHour = 0;
            for (int i = 0; i < piles.length; i++) {
                nowHour += Math.ceil((double) piles[i] / mind);
            }
//            if (nowHour == h)
//                return mind;
            if (nowHour > h) start = mind+1;
            else {
                end = mind-1;
                result = mind;
            }
        }
        return result;
    }

}
