package ru.iedev.taskmanager.model.leetcode.goodNodes;

import ru.iedev.taskmanager.model.leetcode.TreeNode;

public class Solution {
    private int result = 0;

    public int goodNodes(TreeNode root) {
        itIsGoodNodes(root,root.val);
        return result;
    }

    private void itIsGoodNodes(TreeNode root,Integer maxValue){
        if (root == null) return;
        if (root.val >= maxValue) {
            result++;
            maxValue = Math.max(maxValue,root.val);
        }
        itIsGoodNodes(root.right,maxValue);
        itIsGoodNodes(root.left,maxValue);
    }
}
