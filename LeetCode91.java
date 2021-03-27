package LeetCode;

public class LeetCode91 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(rotateRight(node1, 2));
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode tail = head;
        int count = 1;
        while (tail.next != null) {
            tail = tail.next;
            count++;
        }

        int move = k % count;
        //相当于不移动的时候，直接返回
        if (move == 0) {
            return head;
        }

        ListNode temp = head, pre = head;
        while (move-- > 0) {
            pre = temp;
            temp = temp.next;
        }
        // 相当于移动到尾部的时候，直接把尾部结点链接到头结点，并把尾部结点的前一个结点的下一个结点置为空
        if (move == count - 1) {
            temp.next = head;
            pre.next = null;
        } else {
            pre.next = null;
        }

        return temp;
    }
}
