package ru.iedev.taskmanager.model.leetcode.maxLevelSum;

import ru.iedev.taskmanager.model.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final List<Integer> valList = new ArrayList<>();

    public int maxLevelSum(TreeNode root) {
        helper(root,1);

        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < valList.size(); i++) {
            maxVal = Math.max(valList.get(i),maxVal);
        }
        for (int i = 0; i < valList.size(); i++) {
            if (valList.get(i) == maxVal) return i+1;
        }
        return 0;
    }

    private void helper(TreeNode root, int depth){
        if (valList.size()< depth){
            valList.add(root.val);
        }else valList.set(depth-1,valList.get(depth-1) + root.val);
        if (root.left != null) helper(root.left,depth + 1);
        if (root.right != null) helper(root.right,depth + 1);
    }

}
