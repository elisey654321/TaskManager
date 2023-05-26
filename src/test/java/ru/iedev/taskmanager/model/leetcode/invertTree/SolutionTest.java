package ru.iedev.taskmanager.model.leetcode.invertTree;

import org.junit.jupiter.api.Test;
import ru.iedev.taskmanager.model.leetcode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void invertTree() {

        TreeNode test = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        test = new Solution().invertTree(test);
        TreeNode expected = new TreeNode(1,new TreeNode(3),new TreeNode(2));
        assertEquals(expected,test);

    }
}