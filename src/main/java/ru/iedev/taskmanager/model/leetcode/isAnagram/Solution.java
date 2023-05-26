package ru.iedev.taskmanager.model.leetcode.isAnagram;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {

    public boolean isAnagram(String s, String t) {
        char[] charsS = s.toCharArray();
        Arrays.sort(charsS);
        char[] charsT = s.toCharArray();
        Arrays.sort(charsT);
        return Arrays.equals(charsS,charsT);
    }

}

