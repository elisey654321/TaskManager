package ru.iedev.taskmanager.model.leetcode.searchMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchMatrix() {
        int[][] ints = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean result = new Solution().searchMatrix(ints, 20);
        assertEquals(true,result);

    }
}