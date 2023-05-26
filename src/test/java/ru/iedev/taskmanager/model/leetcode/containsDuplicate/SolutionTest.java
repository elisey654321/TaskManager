package ru.iedev.taskmanager.model.leetcode.containsDuplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void containsDuplicate() {
        Assertions.assertEquals(new Solution().containsDuplicate(new int[]{1,2,3,1}), true);
    }

    @Test
    void containsDuplicate1() {
        Assertions.assertEquals(new Solution().containsDuplicate(new int[]{1,2,3,4}), false);
    }

    @Test
    void containsDuplicate2() {
        Assertions.assertEquals(new Solution().containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}), true);
    }

}