package ru.iedev.taskmanager.model.leetcode.maxLevelSum;

import org.junit.jupiter.api.Test;
import ru.iedev.taskmanager.model.leetcode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxLevelSum() {

        TreeNode root = new TreeNode(1,new TreeNode(7,new TreeNode(7),new TreeNode(-8)),new TreeNode(0));
        int result = new Solution().maxLevelSum(root);
        assertEquals(2,result);


    }
}