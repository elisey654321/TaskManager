package ru.iedev.taskmanager.model.leetcode.lowestCommonAncestor;

import ru.iedev.taskmanager.model.leetcode.TreeNode;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode result = null;
        Integer pDepth = Integer.MIN_VALUE;
        Integer qDepth = Integer.MIN_VALUE;

        HashMap<TreeNode,Integer> pTreeNodes = new HashMap<>();
        HashMap<TreeNode,Integer> qTreeNodes = new HashMap<>();

        HashMap<TreeNode,Integer> mainTreeNodes = new HashMap<>();

        findTree(root,p,0,pTreeNodes);
        findTree(root,q,0,qTreeNodes);

        mainTreeNodes = (pTreeNodes.size()>qTreeNodes.size()?pTreeNodes:qTreeNodes);

        for (TreeNode treeNode : mainTreeNodes.keySet()) {
            if (!(pTreeNodes.containsKey(treeNode) && qTreeNodes.containsKey(treeNode))) continue;

            int pDepthTemp = pTreeNodes.get(treeNode);
            int qDepthTemp = qTreeNodes.get(treeNode);

            if (pDepthTemp > pDepth || qDepthTemp > qDepth) {
                result = treeNode;
                pDepth = pDepthTemp;
                qDepth = qDepthTemp;
            }
        }
        return result;
    }

    private void findTree(TreeNode root, TreeNode p,Integer depth, HashMap<TreeNode,Integer> result){
        if (root == null) return;
        if (root.equals(p)){
            result.put(root,depth);
            return;
        }else {
            findTree(root.left,p,depth+1,result);
            if (result.isEmpty()) findTree(root.right,p,depth+1,result);
            if (!result.isEmpty()) result.put(root,depth);
        }
    }

}
