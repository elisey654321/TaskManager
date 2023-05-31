package ru.iedev.taskmanager.model.leetcode.levelOrder;

import ru.iedev.taskmanager.model.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    private final HashMap<Integer,List<Integer>> resultHashMap = new HashMap<>();
    private final ArrayList<List<Integer>> result = new ArrayList<>();
    private int depth = 0;

    public List<List<Integer>> levelOrder(TreeNode root) {

        recursionTree(root,0);

        for (int i = 0; i < resultHashMap.size(); i++) {
            List<Integer> val = resultHashMap.get(i);
            result.add(val);
        }

        return result;
    }

    private void recursionTree(TreeNode root,Integer depth){
        if (root == null) return;
        if (!resultHashMap.containsKey(depth)) resultHashMap.put(depth,new ArrayList<>());
        resultHashMap.get(depth).add(root.val);
        recursionTree(root.left,depth+1);
        recursionTree(root.right,depth+1);
        this.depth = Math.max(depth,this.depth);
    }

}
