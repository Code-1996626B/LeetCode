package LeetCode;

public class LeetCode92 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode res = reverseBetween(head, 4, 5);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        int count = 0;
        ListNode rootTemp = head;
        while (head != null) {
            head = head.next;
            count++;

        }
        head = rootTemp;
        // 左边是头结点，右边不是末尾结点
        if (left == 1 && right < count) {
            ListNode pre = head, cur = head.next, tail = head.next.next;
            while (--right != 0) {
                cur.next = pre;
                pre = cur;
                cur = tail;
                tail = tail.next;
            }
            head.next = cur;
            return pre;
        }

        // 左边不是头结点，右边是末尾结点
        if (left != 1 && right == count) {
            while (--left != 1) {
                head = head.next;
            }
            ListNode pre = head, cur = head.next, tail = head.next.next;
            while (tail != null) {
                cur.next = pre;
                pre = cur;
                cur = tail;
                tail = tail.next;
            }
            cur.next = pre;
            head.next.next = null;
            head.next = cur;
            return rootTemp;
        }

        // 左边是头节点，右边是尾结点
        if (left == 1 && right == count) {
            // 两个结点的情况
            if (head.next.next == null) {
                ListNode root = head.next;
                head.next.next = head;
                root.next = null;
                return root;
            }
            // 大于两个结点的情况
            ListNode pre = head, cur = head.next, tail = head.next.next;
            while (tail != null) {
                cur.next = pre;
                pre = cur;
                cur = tail;
                tail = tail.next;
            }
            cur.next = pre;
            head.next = null;
            return cur;
        }

        int tempLeft = left;
        // 左边结点不是头结点,右边不是尾结点
        while (--left != 1) {
            head = head.next;
        }
        left = tempLeft;
        ListNode pre = head, cur = head.next, tail = head.next.next;
        while ((right--) - left != 0) {
            cur.next = pre;
            pre = cur;
            cur = tail;
            tail = tail.next;
        }
        cur.next = pre;
        head.next.next = tail;
        head.next = cur;

        return rootTemp;
    }
}
