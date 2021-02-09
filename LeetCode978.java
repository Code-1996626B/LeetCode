package LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode978 {

    public static void main(String[] args) {
        int arr[] = {4,8,12,16};
        System.out.println(new LeetCode978().maxTurbulenceSize(arr));
    }

    public int maxTurbulenceSize(int[] arr) {
        if (arr.length <= 1) {
            return arr.length;
        }
        int maxLen = 1;
        Deque<Integer> deque = new LinkedList<>();
        int flag = 1;
        for (int i = 0; i < arr.length; ) {
            if (deque.isEmpty()) {
                deque.addLast(arr[i++]);
            } else {
                if (flag == 1) {
                    if (deque.peekLast() > arr[i]) {
                        deque.addLast(arr[i++]);
                        flag = 2;
                    } else if (deque.peekLast() < arr[i]) {
                        deque.addLast(arr[i++]);
                        flag = 3;
                    } else {
                        deque.removeFirst();
                    }

                } else if (flag == 2) {
                    if (deque.peekLast() < arr[i]) {
                        deque.addLast(arr[i++]);
                        flag = 3;
                    } else {
                        int temp = deque.getLast();
                        deque.clear();
                        deque.addLast(temp);
                        flag =1;
                    }
                } else if (flag == 3) {
                    if (deque.peekLast() > arr[i]) {
                        deque.addLast(arr[i++]);
                        flag = 2;
                    } else {
                        int temp = deque.getLast();
                        deque.clear();
                        deque.addLast(temp);
                        flag =1;
                    }
                }

            }
            if (deque.size() > maxLen) {
                maxLen = deque.size();
            }
        }
        return maxLen;
    }
}
