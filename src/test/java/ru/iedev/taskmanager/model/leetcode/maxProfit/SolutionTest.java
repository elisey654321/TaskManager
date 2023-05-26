package ru.iedev.taskmanager.model.leetcode.maxProfit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProfit() {

        int result = new Solution().maxProfit(new int[]{7,1,5,3,6,4});
        assertEquals(5,result);

    }

    @Test
    void maxProfit1() {

        int result = new Solution().maxProfit(new int[]{7,6,4,3,1});
        assertEquals(0,result);

    }
}