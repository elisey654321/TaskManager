package ru.iedev.taskmanager.model.leetcode.twoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSum() {

        int[] result = new Solution().twoSum(new int[]{2,5,5,11},10);
        assertArrayEquals(result,new int[]{1,2});

    }
}