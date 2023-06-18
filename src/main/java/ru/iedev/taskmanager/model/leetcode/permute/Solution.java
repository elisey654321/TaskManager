package ru.iedev.taskmanager.model.leetcode.permute;

import java.util.*;

public class Solution {

    private final List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        Set<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numsSet.add(nums[i]);
        }
        helper(numsSet,new ArrayList<>());

        return result;
    }

    private void helper(Set<Integer> numsSet,List<Integer> numbers){
        if (numsSet.size() == 0) {
            result.add(numbers);
            return;
        }

        for (Integer nowInt:numsSet) {
            ArrayList<Integer> nowNumber = new ArrayList<>(numbers);
            nowNumber.add(nowInt);
            Set<Integer> numsSet1 = new HashSet<>(numsSet);
            numsSet1.remove(nowInt);
            helper(numsSet1,nowNumber);
        }
    }

}
