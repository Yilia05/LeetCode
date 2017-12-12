/**
 * Created by yzhang46 on 2017/5/10.
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * k is a positive integer and is less than or equal to the length of the linked list.
 * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * Only constant memory is allowed.
 * For example:
 * Given this linked list: 1->2->3->4->5
 * For k = 2, you should return: 2->1->4->3->5
 * For k = 3, you should return: 3->2->1->4->5
 */
public class No25_ReverseNodesinkGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        int count = 0;
        while(cur!=null && count!=k){
            cur = cur.next;
            count++;
        }
        if(count<k){
            return head;
        }
        else{
            cur = reverseKGroup(cur,k);
            while(count >0){//尾插法单链表逆序
                ListNode node = head.next;
                head.next = cur;
                cur = head;
                head = node;
                count--;
            }
            return cur;
        }
    }
}
