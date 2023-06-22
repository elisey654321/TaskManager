package ru.iedev.taskmanager.model.leetcode.wordDictionary.climbStairs;

import org.junit.jupiter.api.Test;
import ru.iedev.taskmanager.model.leetcode.minCostClimbingStairs.Solution;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void climbStairs() {

        int result = new Solution().minCostClimbingStairs(new int[]{10,15,20});
        assertEquals(15,result);

        result = new Solution().minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1});
        assertEquals(6,result);

    }
}