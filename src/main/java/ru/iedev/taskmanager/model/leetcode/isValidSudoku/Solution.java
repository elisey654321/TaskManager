package ru.iedev.taskmanager.model.leetcode.isValidSudoku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public boolean isValidSudoku(char[][] board) {

        int nowX = 0;
        int nowY = 0;

        for (int i = 0; i < 9; i++) {
            //Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
            HashMap<Character,Integer> subBox = new HashMap<>();

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    char c = board[k + nowY][j + nowX];
                    subBox.put(c,subBox.getOrDefault(c,0)+1);
                }
            }

            if (nowX >= 6){
                nowY += 3;
                nowX = 0;
            }else {
                nowX += 3;
            }
            if (!checkHashMap(subBox))
                return false;
            //Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

            //Each row must contain the digits 1-9 without repetition.
            //Each column must contain the digits 1-9 without repetition.

            HashMap<Character,Integer> subContainerX  = new HashMap<>();
            HashMap<Character,Integer> subContainerY  = new HashMap<>();

            char c = ' ';
            for (int k = 0; k < 9; k++) {
                c = board[k][i];
                subContainerY.put(c,subContainerY.getOrDefault(c,0)+1);
                c = board[i][k];
                subContainerX.put(c,subContainerX.getOrDefault(c,0)+1);
            }

            if(!checkHashMap(subContainerX))
                return false;
            if(!checkHashMap(subContainerY))
                return false;

        }
        return true;
    }

    boolean checkHashMap(HashMap<Character,Integer> hashMap){
        for (Character character :hashMap.keySet()) {
            if (!character.equals('.')) {
                Integer value = hashMap.get(character);
                if (value > 1)
                    return false;
            }
        }
        return true;
    }

}
