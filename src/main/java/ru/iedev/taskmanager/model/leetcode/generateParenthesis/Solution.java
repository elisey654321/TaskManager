package ru.iedev.taskmanager.model.leetcode.generateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private int open;
    private int close;

    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        this.open = n;
        this.close = n;
        backtrack(0,0,"",result);
        return result;
    }

    private void backtrack(int nowOpen, int nowClose,String word, List<String> result){

        if(nowClose == close && nowOpen == open){
            result.add(word);
            return;
        }
        if (nowOpen > nowClose && nowClose < close){
            backtrack(nowOpen,nowClose+1,word + ")",result);
        }
        if (nowOpen < open){
            backtrack(nowOpen+1,nowClose,word + "(",result);
        }
    }

}
