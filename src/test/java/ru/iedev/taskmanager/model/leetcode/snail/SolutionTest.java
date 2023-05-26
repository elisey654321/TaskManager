package ru.iedev.taskmanager.model.leetcode.snail;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void testSol1(){
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(new Solution().spiralOrder(matrix));
    }

}