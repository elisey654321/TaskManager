package ru.iedev.taskmanager.model.leetcode.wordDictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class WordDictionary {

    Node root;

    private class Node {

        char value;
        boolean isWord;
        Node[] children;

        public Node(char value) {
            this.value = value;
            isWord = false;
            children = new Node[26];
        }
    }

    public WordDictionary() {
        root = new Node('\0');
    }

    public void addWord(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (curr.children[ch - 'a'] == null) {
                curr.children[ch - 'a'] = new Node(ch);
            }

            curr = curr.children[ch - 'a'];
        }

        curr.isWord = true;
    }

    public boolean search(String word) {
        return searchHelper(word, root, 0);
    }

    private boolean searchHelper(String word, Node curr, int index) {
        for (int i = index; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == '.') {
                for (Node temp : curr.children) {
                    if (temp != null && searchHelper(word, temp, i + 1)) {
                        return true;
                    }
                }

                return false;
            }
            if (curr.children[ch - 'a'] == null) {
                return false;
            }
            curr = curr.children[ch - 'a'];
        }
        return curr.isWord;
    }
}
