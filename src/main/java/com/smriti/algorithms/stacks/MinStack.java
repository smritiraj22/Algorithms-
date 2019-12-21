package com.smriti.algorithms.stacks;

import java.util.Stack;

public class MinStack extends Stack<Integer> {
    private Stack<Integer> stack2;
    MinStack(){
        stack2 = new Stack<Integer>();
    }

    public void push(int val) {
        // must be <=
        if (val <= min()) {
            stack2.push(val);
        }
        super.push(val);
    }

    public Integer pop() {
        int val = super.pop();
        if (val == min()) {
            stack2.pop();
        }
        return val;
    }

    public Integer min() {
        if (stack2.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return stack2.peek();
        }
    }

    public static void main(String[] args) {
        MinStack min = new MinStack();
        min.push(3);
        min.push(4);
        min.push(2);
        System.out.println(min.min());
        System.out.println(min.pop());
        System.out.println(min.min());
        System.out.println(min.pop());
        System.out.println(min.min());
    }
}