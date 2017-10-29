/**
 * Created by yzhang46 on 2017/10/29.
 * Given a linked list, determine if it has a cycle in it.
 * Follow up:
 * Can you solve it without using extra space?
 */
public class No141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode runner = head;
        ListNode walker = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;

    }
}
