package ru.iedev.taskmanager.model.leetcode.minStack;


import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;

class MinStack {

    private final Stack<Integer> stack;
    private final LinkedList<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new LinkedList<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.size() == 0){
            minStack.add(val);
        }else if (minStack.peek() < val) {
            minStack.add(val);
        }else minStack.addFirst(val);
    }

    public void pop() {
        minStack.remove(stack.pop());
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.pollFirst();
    }
}

