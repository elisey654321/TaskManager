package ru.iedev.taskmanager.model.leetcode.isPalindrome;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String text = "";
        Pattern pattern = Pattern.compile("\\w");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            text += s.substring(matcher.start(), matcher.end());
        }

        text = text.replace("_","");

        String s1 = "";
        for (int i = text.length()-1; i >= 0; i--) {
            s1 += text.substring(i,i+1);
        }
        return text.equals(s1);
    }
}
