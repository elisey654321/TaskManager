package ru.iedev.taskmanager.model.leetcode.rightSideView;

import ru.iedev.taskmanager.model.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    private final List<Integer> result = new ArrayList<>();
    private final HashMap<Integer,List<Integer>> resultHashMap = new HashMap<>();

    public List<Integer> rightSideView(TreeNode root) {

        fillRows(root,0);
        for (int i = 0; i < resultHashMap.size(); i++) {
            result.add(resultHashMap.get(i).get(resultHashMap.get(i).size()-1));
        }

        return result;
    }

    public void fillRows(TreeNode root,Integer depth){
        if (root == null) return;
        if (!resultHashMap.containsKey(depth)) resultHashMap.put(depth,new ArrayList<>());
        resultHashMap.get(depth).add(root.val);

        fillRows(root.left,depth + 1);
        fillRows(root.right,depth + 1);
    }

}
