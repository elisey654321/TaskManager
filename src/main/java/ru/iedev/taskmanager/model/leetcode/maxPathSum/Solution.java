package ru.iedev.taskmanager.model.leetcode.maxPathSum;

import ru.iedev.taskmanager.model.leetcode.TreeNode;

public class Solution {
    int result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        getMaxPath(root);
        return result;
    }

    private int getMaxPath(TreeNode root){
        int val;
        if (root.left == null && root.right == null) {
            result = Math.max(result,root.val);
            return root.val;
        }

        if (root.left == null || root.right == null){
            val = Math.max(getMaxPath(root.right != null?root.right:root.left) + root.val,root.val);
            result = Math.max(result,val);
            return val;
        }

        int leftVal = root.left == null?0:getMaxPath(root.left);
        int rightVal = root.right == null?0:getMaxPath(root.right);
        val = leftVal + rightVal + root.val;
        result = Math.max(Math.max(Math.max(Math.max(result,leftVal + root.val),rightVal + root.val),val),root.val);
        return Math.max(Math.max(leftVal + root.val,rightVal + root.val),root.val);
    }

}
