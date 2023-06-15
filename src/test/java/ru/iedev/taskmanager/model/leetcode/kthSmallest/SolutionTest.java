package ru.iedev.taskmanager.model.leetcode.kthSmallest;

import org.junit.jupiter.api.Test;
import ru.iedev.taskmanager.model.leetcode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void kthSmallest_test1() {

        TreeNode root = new TreeNode(4,new TreeNode(2,null,new TreeNode(3)),new TreeNode(5));
        int result = new Solution().kthSmallest(root,1);
        assertEquals(2,result);

    }
}