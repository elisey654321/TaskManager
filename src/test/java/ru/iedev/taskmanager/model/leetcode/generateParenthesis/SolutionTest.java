package ru.iedev.taskmanager.model.leetcode.generateParenthesis;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void generateParenthesis() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("((()))");
        expected.add("(()())");
        expected.add("(())()");
        expected.add("()(())");
        expected.add("()()()");
        List<String> result = new Solution().generateParenthesis(3);

        assertEquals(expected,result);
        
    }

}