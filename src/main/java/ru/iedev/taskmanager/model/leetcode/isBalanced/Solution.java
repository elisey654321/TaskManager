package ru.iedev.taskmanager.model.leetcode.isBalanced;

import ru.iedev.taskmanager.model.leetcode.TreeNode;

public class Solution {

    boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return isBalanced;
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        int delta = left - right;
        delta = (delta < 0?delta*(-1):delta);
        if (delta > 1) isBalanced = false;

        return Math.max(left, right) + 1;
    }
}
