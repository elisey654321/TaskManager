package ru.iedev.taskmanager.model.leetcode.timeMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeMapTest {

    @Test
    public void createTimeMap_test1(){
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 2);  // store the key "foo" and value "bar" along with timestamp = 1.
        timeMap.get("foo", 1);         // return "bar"
        timeMap.get("foo", 3);         // return "bar", since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 is "bar".
        timeMap.set("foo", "bar2", 2); // store the key "foo" and value "bar2" along with timestamp = 4.
        timeMap.get("foo", 4);         // return "bar2"
        timeMap.get("foo", 5);         // return "bar2"
        timeMap.set("foo", "bar3", 10); // store the key "foo" and value "bar2" along with timestamp = 4.
        timeMap.get("foo", 11);         // return "bar2"
        timeMap.get("foo", 15);         // return "bar2"
        timeMap.set("foo", "bar4", 50); // store the key "foo" and value "bar2" along with timestamp = 4.
        timeMap.get("foo", 554);         // return "bar2"
        timeMap.get("foo", 15);         // return "bar2"
    }

}