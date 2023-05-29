package ru.iedev.taskmanager.model.leetcode.findMin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMin() {
        int result = new Solution().findMin(new int[]{3,4,5,1,2});
        assertEquals(1,result);
    }
}