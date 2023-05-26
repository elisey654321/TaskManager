package ru.iedev.taskmanager.model.leetcode.isBalanced;

import org.junit.jupiter.api.Test;
import ru.iedev.taskmanager.model.leetcode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isBalanced_test1() {
        TreeNode root = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        boolean result = new Solution().isBalanced(root);
        assertEquals(true,result);
    }

    @Test
    void isBalanced_test2() {
        TreeNode root = new TreeNode(1,new TreeNode(2,new TreeNode(3,new TreeNode(4),new TreeNode(4)),new TreeNode(3)),new TreeNode(2));
        boolean result = new Solution().isBalanced(root);
        assertEquals(false,result);
    }
}