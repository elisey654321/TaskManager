package ru.iedev.taskmanager.model.leetcode.kthSmallest;

import ru.iedev.taskmanager.model.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private final List<Integer> arrayList = new ArrayList<>();
    private int k;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        fillBstArray(root);
        return arrayList.get(k-1);
    }

    private void fillBstArray(TreeNode root){
        if (arrayList.size() >= this.k) return;

        boolean added = false;
        if (root.left == null && root.right == null) {
            arrayList.add(root.val);
            return;
        }
        if (root.left != null){
            fillBstArray(root.left);
            arrayList.add(root.val);
            added = true;
        }if (root.right != null) {
            if (!added) arrayList.add(root.val);
            fillBstArray(root.right);
        }
    }

}
