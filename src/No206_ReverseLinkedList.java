/**
 * Created by yzhang46 on 2017/11/15.
 * Reverse a singly linked list.
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class No206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode start = null;
        ListNode next = null;
        while (head != null){
            next = head.next;
            head.next = start;
            start = head;
            head = next;
        }
        return start;
    }
}
