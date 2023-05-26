package ru.iedev.taskmanager.model.leetcode.longestConsecutive.isValid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValid() {
        boolean result = new Solution().isValid("()");
        assertEquals(true,result);
    }

    @Test
    void isValid1() {
        boolean result = new Solution().isValid("()[]{}");
        assertEquals(true,result);
    }

    @Test
    void isValid2() {
        boolean result = new Solution().isValid("(]");
        assertEquals(false,result);
    }

    @Test
    void isValid3() {
        boolean result = new Solution().isValid("(){}{{{{}}}}");
        assertEquals(true,result);
    }
    @Test
    void isValid4() {
        boolean result = new Solution().isValid("}");
        assertEquals(false,result);
    }

}