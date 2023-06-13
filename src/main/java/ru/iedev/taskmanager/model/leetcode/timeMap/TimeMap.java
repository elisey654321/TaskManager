package ru.iedev.taskmanager.model.leetcode.timeMap;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.*;

class TimeMap {

    private final Map<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> t = map.getOrDefault(key, new TreeMap<Integer, String>());
        t.put(timestamp, value);
        map.put(key, t);
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        Integer floorKey = map.get(key).floorKey(timestamp);
        if (floorKey != null) {
            return map.get(key).get(floorKey);
        }
        return "";

    }
}
