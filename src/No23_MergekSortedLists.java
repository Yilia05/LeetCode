import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by yzhang46 on 2017/5/8.
 *
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 */
public class No23_MergekSortedLists {
    //method1
    public ListNode mergeKLists_method1(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        //List<ListNode> compareList= new LinkedList<ListNode>();
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length,
            new Comparator<ListNode>() {
                //由小到大排序
                @Override
                public int compare(ListNode o1, ListNode o2) {
                    if(o1.val == o2.val)
                        return 0;
                    else if(o1.val > o2.val){
                        return 1;
                    }
                    else
                        return -1;
                }
            });
        for (ListNode node:lists)
            if (node!=null)
                queue.add(node);

        while (!queue.isEmpty()){
            tail.next=queue.poll();
            tail=tail.next;

            if (tail.next!=null)
                queue.add(tail.next);
        }
        return head.next;
    }


    //method2
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return split(lists, 0, lists.length - 1);
    }
    private ListNode split(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        int mid = start + (end - start) / 2;
        ListNode head1 = split(lists, start, mid);
        ListNode head2 = split(lists, mid + 1, end);
        return mergeSort(head1, head2);
    }
    private ListNode mergeSort(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) {
            return head1 == null ? head2 :head1;
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                cur.next = head1;
                head1 = head1.next;
                cur = cur.next;
            } else {
                cur.next = head2;
                head2 = head2.next;
                cur = cur.next;
            }
        }
        if (head1 != null) {
            cur.next = head1;
        } else if (head2 != null) {
            cur.next = head2;
        }
        return dummy.next;
    }
}
