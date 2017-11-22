import java.util.Stack;

/**
 * Created by yzhang46 on 2017/11/22.
 * Implement the following operations of a queue using stacks.
 *  push(x) -- Push element x to the back of queue.
 *  pop() -- Removes the element from in front of queue.
 *  peek() -- Get the front element.
 *  empty() -- Return whether the queue is empty.
 */
public class No232_ImplementQueueusingStacks {
    /** Initialize your data structure here. */
    Stack<Integer> stack;
    public No232_ImplementQueueusingStacks() {
        Stack<Integer> stack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> temp = new Stack<>();
        while(!stack.empty()){
            temp.push(stack.pop());
        }
        stack.push(x);
        while(!temp.empty()){
            stack.push(temp.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }

    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.size()==0;
    }
}
