package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.TreeMap;

public class LeetCode456 {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(find132pattern(arr));
    }

    public static boolean find132pattern(int[] nums) {
        int n = nums.length;
        Deque<Integer> d = new ArrayDeque<>();
        int k = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < k) return true;
            while (!d.isEmpty() && d.peekLast() < nums[i]) {
                // 事实上，k 的变化也具有单调性，直接使用 k = pollLast() 也是可以的
                k = Math.max(k, d.pollLast());
            }
            d.addLast(nums[i]);
        }
        return false;
    }

}
