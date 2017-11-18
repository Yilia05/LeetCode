import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by yzhang46 on 2017/11/18.
 * Implement the following operations of a stack using queues.
 *   push(x) -- Push element x onto stack.
 *   pop() -- Removes the element on top of the stack.
 *   top() -- Get the top element.
 *   empty() -- Return whether the stack is empty.
 *
 */
public class No225_ImplementStackusingQueues {
    /** Initialize your data structure here. */
    Queue<Integer> queue;
    public No225_ImplementStackusingQueues() {
        Queue<Integer> queue = new PriorityQueue<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        for(int i=0;i<queue.size()-1;i++)
        {
            queue.add(queue.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();

    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
