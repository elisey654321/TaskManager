package ru.iedev.taskmanager.model.leetcode.levelOrder;

import org.junit.jupiter.api.Test;
import ru.iedev.taskmanager.model.leetcode.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void levelOrder() {

        TreeNode t1 = new TreeNode(6);

        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(8);

        TreeNode t4 = new TreeNode(0);
        TreeNode t5 = new TreeNode(4);

        TreeNode t6 = new TreeNode(3);
        TreeNode t7 = new TreeNode(5);

        TreeNode t8 = new TreeNode(7);
        TreeNode t9 = new TreeNode(9);

        t1.left = t2;
        t1.right = t3;

        t2.left = t4;
        t2.right = t5;

        t5.left = t6;
        t5.right = t7;

        t3.left = t8;
        t3.right = t9;

        List<List<Integer>> result = new Solution().levelOrder(t1);
        assertEquals(null,result);

    }
}