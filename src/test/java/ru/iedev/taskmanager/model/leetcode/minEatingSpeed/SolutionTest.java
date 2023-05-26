package ru.iedev.taskmanager.model.leetcode.minEatingSpeed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minEatingSpeed() {
        int result = new Solution().minEatingSpeed(new int[]{3,6,7,11}, 8);
        assertEquals(4,result);
    }

    @Test
    void minEatingSpeed1() {
        int result = new Solution().minEatingSpeed(new int[]{30,11,23,4,20}, 5);
        assertEquals(30,result);
    }

    @Test
    void minEatingSpeed2() {
        int result = new Solution().minEatingSpeed(new int[]{1,1,1,999999999}, 10);
        assertEquals(142857143,result);
    }
}