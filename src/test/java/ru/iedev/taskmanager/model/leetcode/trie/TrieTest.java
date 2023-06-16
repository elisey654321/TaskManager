package ru.iedev.taskmanager.model.leetcode.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    @Test
    public void test1(){
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("appfsafasle");
        trie.insert("appfsafaasdassle");
        trie.insert("appasdasdfsafaasdassle");
        trie.insert("apssspasdasdfsafaasdassle");
        trie.insert("pen");
        trie.insert("swift");
        trie.insert("orange");
        assertEquals(true,trie.search("apple"));   // return True
        assertEquals(false,trie.search("app"));     // return False
        assertEquals(true,trie.startsWith("app"));
        assertEquals(false,trie.startsWith("apps"));// return True
        trie.insert("app");
        assertEquals(true,trie.search("app"));
        assertEquals(true,trie.startsWith("oran"));// return True
    }

}