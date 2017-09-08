import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by yzhang46 on 2017/9/8.
 * Given a linked list, remove the nth node from the end of list and return its head.
 *
 * For example,
 *  Given linked list: 1->2->3->4->5, and n = 2.
 *  After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 *  Note:
 *  Given n will always be valid.
 *  Try to do this in one pass.
 *
 *  keep the gap between low and fast,once the fast points to null,then delete the slow.next
 */
public class No19_RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start;
        ListNode fast = start;
        slow.next = head;

        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }
}

//public class MainClass {
//    public static int[] stringToIntegerArray(String input) {
//        input = input.trim();
//        input = input.substring(1, input.length() - 1);
//        String[] parts = input.split(",");
//        int[] output = new int[parts.length];
//        for(int index = 0; index < parts.length; index++) {
//            String part = parts[index].trim();
//            output[index] = Integer.parseInt(part);
//        }
//        return output;
//    }
//
//    public static ListNode stringToListNode(String input) {
//        // Generate array from the input
//        int[] nodeValues = stringToIntegerArray(input);
//
//        // Now convert that list into linked list
//        ListNode dummyRoot = new ListNode(0);
//        ListNode ptr = dummyRoot;
//        for(int item : nodeValues) {
//            ptr.next = new ListNode(item);
//            ptr = ptr.next;
//        }
//        return dummyRoot.next;
//    }
//
//    public static String listNodeToString(ListNode node) {
//        String result = "";
//        while (node != null) {
//            result += Integer.toString(node.val) + ", ";
//            node = node.next;
//        }
//        return result.substring(0, result.length() - 2);
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            ListNode head = stringToListNode(line);
//            line = in.readLine();
//            int n = Integer.parseInt(line);
//
//            ListNode ret = new Solution().removeNthFromEnd(head, n);
//
//            String out = listNodeToString(ret);
//
//            System.out.print(out);
//        }
//    }
//}