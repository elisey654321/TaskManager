package ru.iedev.taskmanager.model.leetcode.diameterOfBinaryTree;

import ru.iedev.taskmanager.model.leetcode.TreeNode;

public class Solution {
    int maxDepth = 0;
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth = maxDepth(root);
        return maxDiameter;
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        maxDiameter = Math.max(maxDiameter,left+right);
        return Math.max(left, right) + 1;
    }
}
