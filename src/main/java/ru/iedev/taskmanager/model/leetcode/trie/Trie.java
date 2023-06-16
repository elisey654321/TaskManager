package ru.iedev.taskmanager.model.leetcode.trie;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Trie {

    private final HashSet<String> words = new HashSet<>();
    private final Map<String, Map> tries = new HashMap<>();

    public Trie() {
    }

    public void insert(String word) {
        words.add(word);
        Map<String, Map> nowTries = tries;

        for (int i = 0; i < word.length(); i++) {
            String nowChar = word.substring(i,i+1);
            Map map = nowTries.getOrDefault(nowChar,new HashMap<>());
            nowTries.put(nowChar,map);
            nowTries = map;
        }
    }

    public boolean search(String word) {
        return words.contains(word);
    }

    public boolean startsWith(String prefix) {
        Boolean result = true;
        Map<String, Map> nowTries = tries;
        for (int i = 0; i < prefix.length(); i++) {
            String nowChar = prefix.substring(i,i+1);
            if (nowTries.containsKey(nowChar)){
                nowTries = nowTries.get(nowChar);
            }else return false;
        }
        return result;
    }

}
