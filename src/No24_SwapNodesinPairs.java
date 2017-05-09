/**
 * Created by yzhang46 on 2017/5/9.
 *Given a linked list, swap every two adjacent nodes and return its head.
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Your algorithm should use only constant space. You may not modify the values in the list,
 * only nodes itself can be changed.Given a linked list,
 * swap every two adjacent nodes and return its head.
 */
public class No24_SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next==null)
            return head;
        ListNode node = head.next;
        head.next = swapPairs(head.next.next);
        node.next = head;
        return node;
    }
}
