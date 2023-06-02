package ru.iedev.taskmanager.model.leetcode.lengthOfLongestSubstring;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int length = s.length();
        String nowWord = "";
        for (int i = 0; i < length; i++) {
            String symbol = s.substring(i,i+1);
            int indexSearch = 0;
            while (nowWord.indexOf(symbol) > -1){
                String s1 = nowWord.substring(indexSearch, indexSearch + 1);
                nowWord = nowWord.replace(s1,"");
                if (s1.equals(symbol)){
                    break;
                }
            }
            nowWord += symbol;
            result = Math.max(nowWord.length(),result);
        }
        return result;
    }

}
