package ru.iedev.taskmanager.model.leetcode.diagonalSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.iedev.taskmanager.ExceprionTest;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void diagonalSum() throws ExceprionTest {

        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int result = new Solution().diagonalSum(matrix);
        Assertions.assertEquals(25,result);

    }

    @Test
    void diagonalSum2() throws ExceprionTest {

        int[][] matrix = new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int result = new Solution().diagonalSum(matrix);
        Assertions.assertEquals(8,result);

    }

    @Test
    void diagonalSum3() throws ExceprionTest {

        int[][] matrix = new int[][]{{5}};
        int result = new Solution().diagonalSum(matrix);
        Assertions.assertEquals(5,result);

    }
}