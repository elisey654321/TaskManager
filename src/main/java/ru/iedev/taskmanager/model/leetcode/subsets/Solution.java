package ru.iedev.taskmanager.model.leetcode.subsets;

import java.util.*;

public class Solution {

    private final List<List<Integer>> result = new ArrayList<>();
    private final Map<Integer,Integer> indexMap = new HashMap<>();

    public List<List<Integer>> subsets(int[] nums) {

        result.add(new ArrayList<>());

        Set<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numsSet.add(nums[i]);
            indexMap.put(nums[i],i);
        }
        helper(numsSet,new ArrayList<>(),0);

        return result;
    }

    private void helper(Set<Integer> numsSet,List<Integer> numbers, Integer lastIndex){
        if (numsSet.size() == 0) {
            return;
        }

        for (Integer nowInt:numsSet) {
            ArrayList<Integer> nowNumber = new ArrayList<>(numbers);
            Integer index = indexMap.get(nowInt);

            if (index < lastIndex) continue;

            nowNumber.add(nowInt);
            result.add(nowNumber);
            Set<Integer> numsSet1 = new HashSet<>(numsSet);
            numsSet1.remove(nowInt);
            helper(numsSet1,nowNumber,index);
        }
    }

}
