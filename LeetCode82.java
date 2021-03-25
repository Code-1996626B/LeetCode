package LeetCode;

public class LeetCode82 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        System.out.println(deleteDuplicates(node1));

    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // 找出链表的头结点
        while (head != null && head.next != null && head.val == head.next.val) {
            int k = head.val;
            while (head != null && head.val == k) {
                head = head.next;
            }
        }

        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        // 链表的头结点的开始
        ListNode root = head, pre = head.next, cur = head.next.next;
        boolean flag = false;
        while (cur != null) {
            if (pre.val == cur.val) {
                // 如果发现重复的
                while (pre.val == cur.val) {
                    cur = cur.next;
                    // 如果root 后面都是重复的，则root直接接null
                    if (cur == null) {
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    root.next = null;
                    return head;
                } else {
                    // 如果root后面有不重复的
                    // 如果cur后面没有了
                    if (cur.next == null) {
                        root.next = cur;
                        break;
                    } else {
                        pre = cur;
                        cur = cur.next;
                    }
                }
            } else {
                // 如果没有发现重复的
                root.next = pre;
                root = root.next;
                pre = cur;
                cur = cur.next;
            }
        }

        return root;
    }
}
