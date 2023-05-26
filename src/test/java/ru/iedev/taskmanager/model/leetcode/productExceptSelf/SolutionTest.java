package ru.iedev.taskmanager.model.leetcode.productExceptSelf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void productExceptSelf() {
        Solution solution = new Solution();
        int[] result = solution.productExceptSelf(new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{24,12,8,6},result);

    }


}