package ru.iedev.taskmanager.model.leetcode.twoSum2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSum() {

        int[] result = new Solution().twoSum(new int[]{2,3,4},6);
        assertArrayEquals(result,new int[]{1,3});

    }
}