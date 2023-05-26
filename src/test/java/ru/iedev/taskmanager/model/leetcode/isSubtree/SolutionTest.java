package ru.iedev.taskmanager.model.leetcode.isSubtree;

import org.junit.jupiter.api.Test;
import ru.iedev.taskmanager.model.leetcode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isSubtree() {
        TreeNode root = new TreeNode(1);
        TreeNode root1 = new TreeNode(2,new TreeNode(1),null);
        boolean result = new Solution().isSubtree(root1, root);
        assertEquals(true,result);
    }
}