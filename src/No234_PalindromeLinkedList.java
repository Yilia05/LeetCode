/**
 * Created by yzhang46 on 2017/11/23.
 * Given a singly linked list, determine if it is a palindrome.
 */
public class No234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null){
            return true;
        }
        ListNode slow = head,fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverseList(slow);
        while (slow!=null){
            if(head.val != slow.val)
                return false;
            else {
                slow = slow.next;
                head = head.next;
            }
        }
        return true;
    }
    private ListNode reverseList(ListNode head) {
        ListNode start = null;
        while (head != null){
            ListNode next = head.next;
            head.next = start;
            start = head;
            head = next;
        }
        return start;
    }
}
