package ru.iedev.taskmanager.model.leetcode.maxDepth;

import ru.iedev.taskmanager.model.leetcode.TreeNode;

public class Solution {
    int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        maxDepth = recursiveTreeDepth(root, 0);
        return maxDepth;
    }

    private int recursiveTreeDepth(TreeNode root, int depth){
        int tempDepthLeft = depth;
        int tempDepthRight = depth;
        if (root == null) {
            return depth;
        }
        tempDepthLeft = recursiveTreeDepth(root.left,tempDepthLeft+1);
        tempDepthRight = recursiveTreeDepth(root.right,tempDepthRight+1);
        maxDepth = Math.max(Math.max(maxDepth,tempDepthLeft),tempDepthRight);
        return maxDepth;
    }
}
