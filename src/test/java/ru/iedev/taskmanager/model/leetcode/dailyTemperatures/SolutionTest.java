package ru.iedev.taskmanager.model.leetcode.dailyTemperatures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void dailyTemperatures() {

        int[] result = new Solution().dailyTemperatures(new int[]{80,34,80,80,80,34,34,34,34,34});
        int[] expected = new int[]{0,1,0,0,0,0,0,0,0,0};
        assertArrayEquals(expected,result);

    }
}