package ru.iedev.taskmanager.model.leetcode.snail;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] array) {
        ArrayList<Integer> list = new ArrayList();
        while (array.length > 0){
            int[][] newArray = new int[array.length-1][array[0].length];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i==0){
                        list.add(array[i][j]);
                    }else {
                        newArray[i-1][j] = array[i][j];
                    }
                }
            }

            array = newArray.length>0?reversMatrix(newArray):newArray;
        }
//        List<Integer> r = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            r.add(list.get(i));
//        }
        return list;
    }

    private static int[][] reversMatrix(int[][] matrix){
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][matrix[i].length - j - 1];
            }
        }
        return result;
    }
}