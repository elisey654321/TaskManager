package ru.iedev.taskmanager.model.leetcode.maxPathSum;

import org.junit.jupiter.api.Test;
import ru.iedev.taskmanager.model.leetcode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxPathSum_test1() {

        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        int result = new Solution().maxPathSum(root);
        assertEquals(6,result);

    }

    @Test
    void maxPathSum_test2() {

        TreeNode root = new TreeNode(-10, new TreeNode(9), new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        int result = new Solution().maxPathSum(root);
        assertEquals(42,result);

    }

    @Test
    void maxPathSum_test3() {

        TreeNode root = new TreeNode(2,new TreeNode(-1),null);
        int result = new Solution().maxPathSum(root);
        assertEquals(2,result);

    }

    @Test
    void maxPathSum_test5() {

        TreeNode root = new TreeNode(5,new TreeNode(4,new TreeNode(11,new TreeNode(7),new TreeNode(2)),null),
                new TreeNode(8,new TreeNode(13),new TreeNode(4,null,new TreeNode(1))));
        int result = new Solution().maxPathSum(root);
        assertEquals(48,result);

    }
}