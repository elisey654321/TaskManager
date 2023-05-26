package ru.iedev.taskmanager.model.leetcode.isSameTree;

import ru.iedev.taskmanager.model.leetcode.TreeNode;

public class Solution {
    boolean isSameTree = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }else if(p == null || q == null) {
            isSameTree = false;
            return false;
        }else if (p.val == q.val){
            isSameTree(p.right,q.right);
            isSameTree(p.left,q.left);
        }else isSameTree = false;
        return isSameTree;
    }
}
