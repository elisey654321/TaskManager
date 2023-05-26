package ru.iedev.taskmanager.model.leetcode.longestConsecutive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestConsecutive() {
        int result = new Solution().longestConsecutive(new int[]{100,4,200,1,3,2});
        assertEquals(4,result);
    }

    @Test
    void longestConsecutive1() {
        int result = new Solution().longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});
        assertEquals(9,result);
    }

    @Test
    void longestConsecutive2() {
        int result = new Solution().longestConsecutive(new int[]{4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3});
        assertEquals(5,result);
    }

}