package ru.iedev.taskmanager.model.leetcode.longestConsecutive.isValid;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        Map<String,String> open = new HashMap<>();
        open.put("(",")");
        open.put("{","}");
        open.put("[","]");
        Map<String,String> closed = new HashMap<>();
        closed.put(")","(");
        closed.put("}","{");
        closed.put("]","[");
        Stack<String> strings = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String symbol = s.substring(i, i+1);
            if (open.get(symbol) != null){
                strings.push(symbol);
            } else {
                if (strings.size() == 0) return false;
                String peek = strings.peek();
                if (closed.get(symbol).equals(peek)){
                    strings.pop();
                }else return false;
            }
        }
        if (strings.size() == 0) return true;
        else return false;
    }
}
