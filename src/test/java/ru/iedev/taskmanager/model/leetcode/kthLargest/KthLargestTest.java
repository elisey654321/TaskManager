package ru.iedev.taskmanager.model.leetcode.kthLargest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {

    @Test
    public void test_1(){
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        assertEquals(4,kthLargest.add(3));   // return 4
        assertEquals(5,kthLargest.add(5));   // return 5
        assertEquals(5,kthLargest.add(10));  // return 5
        assertEquals(8,kthLargest.add(9));   // return 8
        assertEquals(8,kthLargest.add(4));   // return 8
    }

    @Test
    public void test_2(){
        KthLargest kthLargest = new KthLargest(2, new int[]{0});
        assertEquals(-1,kthLargest.add(-1));   // return 4
        assertEquals(0,kthLargest.add(1));   // return 5
        assertEquals(0,kthLargest.add(-2));  // return 5
        assertEquals(0,kthLargest.add(-4));   // return 8
        assertEquals(1,kthLargest.add(3));   // return 8
    }

}