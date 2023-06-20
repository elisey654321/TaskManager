package ru.iedev.taskmanager.model.leetcode.combinationSum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void combinationSum_test1() {

        List<List<Integer>> result = new Solution().combinationSum(new int[]{2, 3, 6, 7}, 7);

    }

    @Test
    void combinationSum_test2() {

        List<List<Integer>> result = new Solution().combinationSum(new int[]{2,3,5}, 8);

    }

}