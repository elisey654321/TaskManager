package ru.iedev.taskmanager.model.leetcode.groupAnagrams;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> resultMap = new HashMap<>();
        for (String str : strs) {
            char[] charsStr = str.toCharArray();
            Arrays.sort(charsStr);
            String sorted = new String(charsStr);
            List<String> stringList = resultMap.getOrDefault(sorted, new ArrayList<>());
            stringList.add(str);
            resultMap.put(sorted, stringList);
        }

        return new ArrayList<>(resultMap.values());
    }

}
