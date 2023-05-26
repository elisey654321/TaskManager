package ru.iedev.taskmanager.model.leetcode.invertTree;

import ru.iedev.taskmanager.model.leetcode.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        } else if (root.left == null && root.right == null) {
            return root;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode tempRoot = root.left;
        root.left = root.right;
        root.right = tempRoot;
        return root;
    }

    private void recursiveBranchSwap(TreeNode root){
        if (root == null){
            return;
        } else if (root.left == null && root.right == null) {
            return;
        }
        recursiveBranchSwap(root.left);
        recursiveBranchSwap(root.right);
        TreeNode tempRoot = root.left;
        root.left = root.right;
        root.right = tempRoot;
    }

}
