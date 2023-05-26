package ru.iedev.taskmanager.model.leetcode.diagonalSum;

class Solution {
    public int diagonalSum(int[][] mat) {

        int iterationCount = mat.length;
        int result = 0;
        for (int i = 0; i < iterationCount; i++) {
            result += mat[i][i];
            result += mat[iterationCount - i - 1][i];
        }

        if (iterationCount%2 != 0){
            int center = iterationCount/2;
            result -= mat[center][center];
        }

        return result;
    }
}