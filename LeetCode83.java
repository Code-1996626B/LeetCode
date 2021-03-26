package LeetCode;

public class LeetCode83 {

    public static void main(String[] args) {

    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode root = head, cur = head.next;
        while (cur != null) {
            if (head.val == cur.val) {
                cur = cur.next;
            } else {
                // 不相等的时候
                head.next = cur;
                head = head.next;
                cur = cur.next;
                head.next = null;
            }
        }

        return root;
    }
}
