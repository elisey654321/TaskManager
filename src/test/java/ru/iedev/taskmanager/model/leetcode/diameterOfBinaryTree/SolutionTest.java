package ru.iedev.taskmanager.model.leetcode.diameterOfBinaryTree;

import org.junit.jupiter.api.Test;
import ru.iedev.taskmanager.model.leetcode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void diameterOfBinaryTree() {
        TreeNode test = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3));
        int result = new Solution().diameterOfBinaryTree(test);

        assertEquals(3, result);
    }
}