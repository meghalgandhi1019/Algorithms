package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
Queue<Integer> q = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        q.add(x);
        
        int n = q.size();
        while (n-- > 1)
            q.add(q.poll());
    }

    // Removes the element on top of the stack.
    public void pop() {
        q.poll();
    }

    // Get the top element.
    public int top() {
        return q.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }

}
