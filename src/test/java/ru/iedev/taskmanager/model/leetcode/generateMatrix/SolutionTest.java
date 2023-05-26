package ru.iedev.taskmanager.model.leetcode.generateMatrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void generateMatrix() {

//        Assertions.assertArrayEquals(new int[][]{{1,2,3},{8,9,4},{7,6,5}},new Solution().generateMatrix(3));
//        Assertions.assertArrayEquals(new int[][]{{1}},new Solution().generateMatrix(1));
        Assertions.assertArrayEquals(new int[][]{{1}},new Solution().generateMatrix(6));

    }
}