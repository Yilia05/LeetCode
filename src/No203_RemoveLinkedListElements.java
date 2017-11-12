/**
 * Created by yzhang46 on 2017/11/12.
 * Remove all elements from a linked list of integers that have value val.
 */
public class No203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode curr = head, prev = start;
        while (curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            }else{
                prev = prev.next;
            }
            curr = curr.next;
        }
        return start.next;
    }
}
