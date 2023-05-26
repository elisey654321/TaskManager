package ru.iedev.taskmanager.model.leetcode.maxDepth;

import org.junit.jupiter.api.Test;
import ru.iedev.taskmanager.model.leetcode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxDepth() {
        TreeNode test = new TreeNode(1, new TreeNode(2,new TreeNode(1,new TreeNode(2),null),null), new TreeNode(3));
        int result = new Solution().maxDepth(test);

        assertEquals(4, result);
    }
}