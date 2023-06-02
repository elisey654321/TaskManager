package ru.iedev.taskmanager.model.leetcode.lengthOfLongestSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLongestSubstring() {
        int result = new Solution().lengthOfLongestSubstring("abcabcbb");
        assertEquals(3,result);
    }
    @Test
    void lengthOfLongestSubstring1() {
        int result = new Solution().lengthOfLongestSubstring("bbbbb");
        assertEquals(1,result);
    }
    @Test
    void lengthOfLongestSubstring2() {
        int result = new Solution().lengthOfLongestSubstring("pwwkew");
        assertEquals(3,result);
    }
    @Test
    void lengthOfLongestSubstring3() {
        int result = new Solution().lengthOfLongestSubstring("aab");
        assertEquals(2,result);
    }
    @Test
    void lengthOfLongestSubstring4() {
        int result = new Solution().lengthOfLongestSubstring("tmmzuxt");
        assertEquals(5,result);
    }
}