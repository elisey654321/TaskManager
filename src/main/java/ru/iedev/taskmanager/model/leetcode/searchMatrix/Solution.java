package ru.iedev.taskmanager.model.leetcode.searchMatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length;
        int row = matrix.length;
        int start = 0;
        int end = col * row - 1;
        int mind;

        while (start <= end) {
            mind = start + (end - start) / 2;
            int nowCol = mind % col;
            int nowRow = mind / col;
            int nowNumber = matrix[nowRow][nowCol];
            if (nowNumber == target) return true;

            if (nowNumber < target) start = mind + 1;
            else end = mind - 1;
        }

        return false;
    }
}
