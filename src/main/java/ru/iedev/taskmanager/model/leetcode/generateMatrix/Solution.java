package ru.iedev.taskmanager.model.leetcode.generateMatrix;

class Solution {
    public int[][] generateMatrix(int n) {
        int nowY = 0;
        int nowX = 0;

        int[][] result = new int[n][n];

        for (int i = 1; i <= n*n; i++) {
            boolean loadFactor = false;

            while (!loadFactor) {
                if (result[nowY][nowX] == 0) {
                    result[nowY][nowX] = i;
                    loadFactor = true;
                }
                if (loadFactor) {
                    if (nowX + 1 >= n) {
                        result = reversMatrix(result, n);
                        nowX = 0;
                    } else if (result[nowY][nowX + 1] != 0) {
                        result = reversMatrix(result, n);

                        boolean incrementY = true;
                        for (int j = 0; j < n; j++) {
                            if (result[nowY][j] == 0){
                                incrementY = false;
                            }
                        }
                        if (incrementY){
                            nowY++;
                            nowX = 0;
                        }else nowX = 0;
                    }else nowX++;
                }else {
                    nowX++;
                }
            }

        }

        while (result[0][0] != 1){
            result = reversMatrix(result, n);
        }

        System.gc();

        return result;
    }

    private static int[][] reversMatrix(int[][] matrix, int sizeMatrix){
        int[][] result = new int[sizeMatrix][sizeMatrix];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][matrix[i].length - j - 1];
            }
        }
        return result;
    }

}