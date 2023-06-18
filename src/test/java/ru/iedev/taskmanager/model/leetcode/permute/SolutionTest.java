package ru.iedev.taskmanager.model.leetcode.permute;

import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void permute() {

        List<List<Integer>> result = new Solution().permute(new int[]{1, 2, 3});

    }
}