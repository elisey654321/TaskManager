package ru.iedev.taskmanager.model.leetcode.wordDictionary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryTest {

    @Test
    public void test1(){
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
//        assertEquals(false,wordDictionary.search("pad")); // return False
//        assertEquals(true,wordDictionary.search("bad")); // return True
        assertEquals(true,wordDictionary.search(".ad")); // return True
        assertEquals(true,wordDictionary.search("b..")); // return True
        assertEquals(false,wordDictionary.search("c.."));
        assertEquals(false,wordDictionary.search(".c."));
    }

    @Test
    public void test2(){
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("a");
        wordDictionary.addWord("a");
//        assertEquals(false,wordDictionary.search("pad")); // return False
//        assertEquals(true,wordDictionary.search("bad")); // return True
        assertEquals(false,wordDictionary.search("a.")); // return True
        assertEquals(false,wordDictionary.search("b..")); // return True
        assertEquals(false,wordDictionary.search("c.."));
        assertEquals(false,wordDictionary.search(".c."));
    }

}