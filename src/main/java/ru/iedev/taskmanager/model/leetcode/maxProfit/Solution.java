package ru.iedev.taskmanager.model.leetcode.maxProfit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int buy=prices[0];
        for(int price:prices){
            if(price-buy>maxProfit)
                maxProfit=price-buy;
            else if(price<buy)
                buy=price;
        }
        return maxProfit;
    }
}
