package ru.iedev.taskmanager.model.leetcode.isPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPalindrome() {

        boolean isPalindrome = new Solution().isPalindrome("A man, a plan, a canal: Panama");
        assertEquals(true,isPalindrome);

    }

    @Test
    void isPalindrome1() {

        boolean isPalindrome = new Solution().isPalindrome("race a car");
        assertEquals(false,isPalindrome);

    }

    @Test
    void isPalindrome2() {

        boolean isPalindrome = new Solution().isPalindrome(" ");
        assertEquals(true,isPalindrome);

    }
}