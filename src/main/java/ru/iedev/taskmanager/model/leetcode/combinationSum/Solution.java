package ru.iedev.taskmanager.model.leetcode.combinationSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private final List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates,target, new ArrayList<>());
        return result;
    }

    void helper(int[] candidates, int target, List<Integer> values) {
        int value = 0;
        int valSize = values.size();
        int lastVal = 0;
        for (int i = 0; i < valSize; i++) {
            value += values.get(i);
        }

        if (valSize > 0) {
            lastVal = values.get(values.size() - 1);
        }

        for (int i = 0; i < candidates.length; i++) {
            int candidate = candidates[i];
            int tempValue = value + candidate;

            if (candidate < lastVal) continue;
            if (tempValue > target) continue;

            List<Integer> valuesTemp = new ArrayList<>(values);
            if (tempValue == target) {
                valuesTemp.add(candidate);
                result.add(valuesTemp);
            } else {
                valuesTemp.add(candidate);
                helper(candidates, target, valuesTemp);
            }
        }

    }

}
