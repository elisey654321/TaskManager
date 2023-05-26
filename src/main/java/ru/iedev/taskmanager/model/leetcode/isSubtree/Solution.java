package ru.iedev.taskmanager.model.leetcode.isSubtree;

import ru.iedev.taskmanager.model.leetcode.TreeNode;

public class Solution {

    boolean isSameTree = true;
    boolean isSameSubtree = false;

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if( root == null) return false;
        if (isSameSubtree) return true;

        isSameTree = true;
        isSameSubtree = isSameTree(root.right,subRoot);
        if (isSameSubtree) return true;
        isSameTree = true;
        isSameSubtree = isSameTree(root.left,subRoot);
        if (isSameSubtree) return true;

        isSameSubtree = isSubtree(root.right,subRoot);
        isSameSubtree = isSubtree(root.left,subRoot);
        return isSameSubtree;
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
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
