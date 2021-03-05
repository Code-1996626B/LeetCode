package LeetCode;

import java.util.Stack;

public class LeetCode232 {

    public static void main(String[] args) {

    }


}

class MyQueue {

    Stack<Integer> stack1;

    Stack<Integer> stack2;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        while (!stack1.isEmpty()) {
            int m = stack1.pop();
            stack2.push(m);
        }
        return stack2.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        while (!stack1.isEmpty()) {
            int m = stack1.pop();
            stack2.push(m);
        }
        return stack2.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
