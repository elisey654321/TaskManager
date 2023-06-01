package ru.iedev.taskmanager.model.leetcode.shortestPathBinaryMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void shortestPathBinaryMatrix() {
        int actual = new Solution().shortestPathBinaryMatrix(new int[][]{{0, 1}, {1, 0}});
        assertEquals(2,actual);
    }

    @Test
    void shortestPathBinaryMatrix1() {
        int actual = new Solution().shortestPathBinaryMatrix(new int[][]{{0,0,0}, {1,1,0}, {1,1,0}});
        assertEquals(4,actual);
    }

    @Test
    void shortestPathBinaryMatrix2() {
        int actual = new Solution().shortestPathBinaryMatrix(new int[][]{{0,0,0}, {0,1,0}, {0,0,0}});
        assertEquals(4,actual);
    }

    @Test
    void shortestPathBinaryMatrix3() {
        int actual = new Solution().shortestPathBinaryMatrix(new int[][]{{0,0}, {0,0}});
        assertEquals(2,actual);
    }

}