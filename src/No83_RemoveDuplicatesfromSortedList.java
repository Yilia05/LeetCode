/**
 * Created by yzhang46 on 2017/12/12.
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 */
public class No83_RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode begin = head;
        ListNode start = new ListNode(0);
        start.next = begin;
        while(begin.next != null){
            if(begin.val == begin.next.val){
                if(begin.next.next != null){
                    begin.next = begin.next.next;
                }
                else{
                    begin.next = null;
                }
            }
            else{
                begin = begin.next;
            }
        }
        return start.next;
    }
}
